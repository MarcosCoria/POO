/* Ejercicio_03: Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado */
package java_extra_003;

import Entidad.Juego;
import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_003 {
    public static void main(String[] args) {
        Juego juego= new Juego();
        System.out.println("Ingrese cantidad de juegos a disputar: ");
        juego.setTotal(Validar());
        System.out.println("Ingrese la cantidad de intentos por juego: ");
        juego.setIntentosTotales(Validar());
        System.out.println("Ingrese nombre del jugador 1: ");
        juego.setJugador1(Nombre());
        System.out.println("Ingrese nombre del jugador 2: ");
        juego.setJugador2(Nombre());
        System.out.println("");
        juego.IniciarJuego(juego);
    }   
    public static int Validar(){
        Scanner leer = new Scanner(System.in);
        int num= leer.nextInt();
        while (num<=0) {
            System.out.println("Error. Ingrese un número válido: ");
            num= leer.nextInt();
        }
        return num;
    }
    public static String Nombre(){
        Scanner leer = new Scanner(System.in);
        String nombre= leer.nextLine();
        while (nombre.equals("") || nombre.equals(" ")) {
            System.out.println("Error. Ingrese un nombre válido: ");
            nombre= leer.nextLine();
        }
        return nombre;
    }
}