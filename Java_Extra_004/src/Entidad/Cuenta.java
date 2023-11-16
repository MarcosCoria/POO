/* Ejercicio_04: Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro. */
package Entidad;

import java.util.Scanner;

/* @author G96xyFast */
public class Cuenta {
    private float saldo;
    private String titular;

    public Cuenta() {
    }
    public Cuenta(float saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    public Cuenta RetirarDinero(Cuenta cuenta){
        Cuenta aux= cuenta; // Objeto auxiliar
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la cantidad a retirar: ");
        float retiro= leer.nextFloat();
        if (retiro>aux.getSaldo()) {
            System.out.println("No se puede hacer un retiro superior al saldo actual(" + aux.getSaldo() + ")");
        } else {
            aux.setSaldo(aux.getSaldo()-retiro);
            System.out.println("Retiro exitoso. Saldo actual: " + aux.getSaldo());
        }
        return cuenta; // Devolvemos los datos modificados
    }
}
