/* Ejercicio_03: Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main */
package java_003;

import Entidad.Operacion;
import java.util.Scanner;

/* @author G96xyFast */
public class Java_003 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion op= new Operacion();
        op= op.CrearOperacion();
        boolean var= false;
        while (var==false) {
            System.out.println("MENÚ:\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Salir");
            int num= leer.nextInt();
            switch (num) {
                case 1:
                    System.out.println("La suma es: " + op.Sumar(op.getNumero1(), op.getNumero2()));
                    break;
                case 2:
                    System.out.println("La resta es: " + op.Restar(op.getNumero1(), op.getNumero2()));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + op.Multiplicar(op.getNumero1(), op.getNumero2()));
                    break;
                case 4:
                    if (op.Dividir(op.getNumero1(), op.getNumero2())==0) {
                        System.out.println("No es posible dividir por 0");
                    } else {
                        System.out.println("La división es: " + op.Dividir(op.getNumero1(), op.getNumero2()) );
                    }
                    break;
                case 5:
                    System.out.println("Finalizando. greacias por usar el programa. ");
                    var=true;
                    break;
                default:
                    System.out.println("Error. Ingrese otra opción");;
            }
        }
    }  
}
