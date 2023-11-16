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
        empleado.setNombre(leer.nextLine());
        System.out.println("Ingrese edad del empleado: ");
        empleado.setEdad(leer.nextInt());
        System.out.println("Ingrese salario del empleado: ");
        empleado.setSalario(leer.nextDouble());
        System.out.println("Datos 'to.String': " + empleado.toString());
        empleado= empleado.CalcularAumento(empleado);
        System.out.println("Datos 'to.String': " + empleado.toString());
    }   
}