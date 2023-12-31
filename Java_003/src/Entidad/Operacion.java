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
package Entidad;

import java.util.Scanner;

/* @author G96xyFast */
public class Operacion {
    private int numero1, numero2;

    public Operacion() {
    }
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    public Operacion CrearOperacion(){
        Operacion aux= new Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1= leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2= leer.nextInt();
        aux.setNumero1(num1);
        aux.setNumero2(num2);
        return aux;
    }
    
    public int Sumar(int num1, int num2){
        return (num1+num2);
    }
    public int Restar(int num1, int num2){
        return (num1-num2);
    }
    public int Multiplicar(int num1, int num2){
        return (num1*num2);
    }
    public double Dividir(int num1, int num2){
        if (num2==0) {
            return 0;
        } else {
            return (num1/num2);
        }
    }
}
