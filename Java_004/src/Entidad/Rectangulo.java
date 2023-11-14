/* Ejercicio_04: Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base*altura / Perímetro = (base + altura)*2   */
package Entidad;

import java.util.Scanner;

/* @author G96xyFast */
public class Rectangulo {
    private float base, altura;

    public Rectangulo() {
    }
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    public Rectangulo CrearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo aux= new Rectangulo();
        System.out.println("Ingrese la base del rectángulo: ");
        float num1= leer.nextFloat();
        while (num1<=0) {
            System.out.println("Error. Ingrese la base del rectángulo: ");
            num1= leer.nextFloat();
        }
        System.out.println("Ingrese la altura del rectángulo: ");
        float num2= leer.nextFloat();
        while (num2<=0) {
            System.out.println("Error. Ingrese la altura del rectángulo: ");
            num2= leer.nextFloat();
        }
        aux.setBase(num1);
        aux.setAltura(num2);
        return aux;
    }
    public float Superficie(float num1, float num2){
        float aux= num1*num2;
        return aux;
    }
    public float Perimetro(float num1, float num2){
        float aux= (num1 + num2)*2;
        return aux;
    }
    public void Dibujar(float num1, float num2){
        int a= (int)(num1);
        int b= (int)(num2);
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (i==0 || j==0 || (i==b-1) || j==(a-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}