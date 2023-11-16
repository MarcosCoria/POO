/* Ejercicio_03: Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado */
package Entidad;

import java.util.Scanner;

/* @author G96xyFast */
public class Juego {

    private String jugador1, jugador2;
    private int total, intentosTotales, intentos1, intentos2, cont1, cont2;

    public Juego(String jugador1, String jugador2, int total, int intentosTotales, int intentos1, int intentos2, int cont1, int cont2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.total = total;
        this.intentosTotales = intentosTotales;
        this.intentos1 = intentos1;
        this.intentos2 = intentos2;
        this.cont1 = cont1;
        this.cont2 = cont2;
    }

    public Juego() {
    }
    // Seteamos los contadores en 0 en el constructor

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIntentosTotales() {
        return intentosTotales;
    }

    public void setIntentosTotales(int intentosTotales) {
        this.intentosTotales = intentosTotales;
    }

    public int getIntentos1() {
        return intentos1;
    }

    public void setIntentos1(int intentos1) {
        this.intentos1 = intentos1;
    }

    public int getIntentos2() {
        return intentos2;
    }

    public void setIntentos2(int intentos2) {
        this.intentos2 = intentos2;
    }

    public int getCont1() {
        return cont1;
    }

    public void setCont1(int cont1) {
        this.cont1 = cont1;
    }

    public int getCont2() {
        return cont2;
    }

    public void setCont2(int cont2) {
        this.cont2 = cont2;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", total=" + total + ", intentosTotales=" + intentosTotales + ", intentos1=" + intentos1 + ", intentos2=" + intentos2 + ", cont1=" + cont1 + ", cont2=" + cont2 + '}';
    }

    // Optimizar!! NO debería repetirsse el código
    public void IniciarJuego(Juego aux) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < aux.getTotal(); i++) { // Total de juegos
            // Usar un 'if' para variar el jugador que juega
            if (i % 2 == 0) {
                System.out.println("TURNO DEL JUGADOR Nº1: ");
                int cant2 = 0;
                System.out.println("Juego Nº" + (i + 1));
                System.out.println("Jugador " + aux.getJugador1() + " ingrese un número: ");
                int num1 = leer.nextInt();
                System.out.println("Jugador " + aux.getJugador2() + " adivine el número: ");
                for (int k = 0; k < aux.intentosTotales; k++) { // Total de intentos
                    if (cant2 < aux.getIntentosTotales()) {
                        int num2 = leer.nextInt();
                        cant2++;
                        aux.setIntentos2(aux.getIntentos2() + 1); // Sumatoria de intentos jugador 2
                        if (num2 > num1) {
                            System.out.println("Más bajo");
                            if (cant2 == aux.getIntentosTotales()) {
                                System.out.println("PERDISTE JUGADOR Nº2, JUGADOR Nº1 GANÓ 1 PUNTO\n");
                                aux.setCont1(aux.getCont1() + 1); // Aumenta en 1 la victoria del jugador 1
                            }
                        } else if (num2 < num1) {
                            System.out.println("Más alto");
                            if (cant2 == aux.getIntentosTotales()) {
                                System.out.println("PERDISTE JUGADOR Nº2, JUGADOR Nº1 GANÓ 1 PUNTO\n");
                                aux.setCont1(aux.getCont1() + 1); // Aumenta en 1 la victoria del jugador 1
                            }
                        } else {
                            System.out.println("GANASTE JUGADOR Nº2\n");
                            aux.setCont2(aux.getCont2() + 1); // Aumenta en 1 la victoria del jugador 2
                            k = aux.getIntentosTotales(); // Rompemos el bucle
                        }
                    }
                }
            } else {
                System.out.println("TURNO DEL JUGADOR Nº2: ");
                int cant1 = 0;
                System.out.println("Juego Nº" + (i + 1));
                System.out.println("Jugador " + aux.getJugador2() + " ingrese un número: ");
                int num1 = leer.nextInt();
                System.out.println("Jugador " + aux.getJugador1() + " adivine el número: ");
                for (int k = 0; k < aux.intentosTotales; k++) { // Total de intentos
                    if (cant1 < aux.getIntentosTotales()) {
                        int num2 = leer.nextInt();
                        cant1++;
                        aux.setIntentos1(aux.getIntentos1() + 1); // Sumatoria de intentos jugador 1
                        if (num2 > num1) {
                            System.out.println("Más bajo");
                            if (cant1 == aux.getIntentosTotales()) {
                                System.out.println("PERDISTE JUGADOR Nº1, JUGADOR Nº1 GANÓ 2 PUNTO\n");
                                aux.setCont2(aux.getCont2() + 1); // Aumenta en 1 la victoria del jugador 2
                            }
                        } else if (num2 < num1) {
                            System.out.println("Más alto");
                            if (cant1 == aux.getIntentosTotales()) {
                                System.out.println("PERDISTE JUGADOR Nº1, JUGADOR Nº1 GANÓ 1 PUNTO\n");
                                aux.setCont2(aux.getCont2() + 1); // Aumenta en 1 la victoria del jugador 2
                            }
                        } else {
                            System.out.println("GANASTE JUGADOR Nº1\n");
                            aux.setCont1(aux.getCont1() + 1); // Aumenta en 1 la victoria del jugador 1
                            k = aux.getIntentosTotales(); // Rompemos el bucle
                        }
                    }
                }
            }
        }
        System.out.println("RESULTADOS:");
        System.out.println("Nombre jugador1: " + aux.getJugador1());
        System.out.println("Nombre jugador2: " + aux.getJugador2());
        System.out.println("Cantidad de juegos: " + aux.getTotal());
        System.out.println("Límite de intentos: " + aux.getIntentosTotales());
        System.out.println("Intentos del jugador1: " + aux.getIntentos1());
        System.out.println("Intentos del jugador2: " + aux.getIntentos2());
        System.out.println("Victorias jugador1: " + aux.getCont1());
        System.out.println("Victorias jugador2: " + aux.getCont2());
    }
}
