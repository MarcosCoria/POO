/* Ejercicio_05: Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años */
package java_extra_005;

import Entidad.Empleado;
import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_005 {
    public static void main(String[] args) {
        // Falta las verificaciones
        Scanner leer = new Scanner(System.in);
        Empleado empleado = new Empleado();
        System.out.println("Ingrese nombre del empleado: ");
        empleado.setNombre(Nombre());
        System.out.println("Ingrese edad del empleado: ");
        empleado.setEdad(Comprobar());
        System.out.println("Ingrese salario del empleado: ");
        empleado.setSalario(Salario());
        System.out.println("Datos 'to.String': " + empleado.toString());
        empleado= empleado.CalcularAumento(empleado);
        System.out.println("Datos 'to.String': " + empleado.toString());
    }   
    public static int Comprobar(){
        Scanner leer = new Scanner(System.in);
        int aux= leer.nextInt();
        while (aux<18) {
            System.out.println("Error. Ingrese un dato válido. El empleado debe ser mayor de 18 años: ");
            aux=leer.nextInt();
        }
        return aux;
    }
    public static double Salario(){
        Scanner leer = new Scanner(System.in);
        double aux= leer.nextDouble();
        while (aux<=0) {
            System.out.println("Error. Ingrese un dato válido: ");
            aux=leer.nextDouble();
        }
        return aux;
    }
    public static String Nombre() {
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        boolean aux = false;
        while (aux == false) {
            boolean var = false;
            for (int i = 0; i < nombre.length(); i++) {
                if (!nombre.substring(i, i + 1).equals(" ")) {
                    var = true; // Si hay al menos una letra devuelve 'true'
                }
            }
            if (var == false) {
                System.out.println("Error. Ingrese un nombre válido");
                nombre = leer.nextLine();
            } else if (nombre.isEmpty()) {
                System.out.println("Error. Ingrese un nombre válido");
                nombre = leer.nextLine();
            } else {
                System.out.println("Válido. Nombre: " + nombre);
                aux= true; // Rompemos el bucle principal
            }
        }
        return nombre;
    }
}