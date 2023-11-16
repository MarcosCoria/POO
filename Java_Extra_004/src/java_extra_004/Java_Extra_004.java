/* Ejercicio_04: Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro. */
package java_extra_004;

import Entidad.Cuenta;
import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_004 {
    public static void main(String[] args) {
        Cuenta cuenta= new Cuenta();
        System.out.println("Ingrese saldo: ");
        cuenta.setSaldo(Comprobar());
        System.out.println("Ingrese nombre del titular: ");
        cuenta.setTitular(Nombre());
        cuenta= cuenta.RetirarDinero(cuenta);
        System.out.println("Saldo método 'to.String': " + cuenta.toString());
    }   
    public static float Comprobar(){
        Scanner leer = new Scanner(System.in);
        float aux= leer.nextFloat();
        while (aux<=0) {
            System.out.println("Error. Ingrese un valor válido: ");
            aux= leer.nextFloat();
        }
        return aux;
    }
    public static String Nombre(){
        Scanner leer = new Scanner(System.in);
        String nombre= leer.nextLine();
        while (nombre.equals("")|| nombre.equals(" ")) {
            System.out.println("Error. Ingrese un nombre válido: ");
            nombre= leer.nextLine();
        }
        return nombre;
    }
}