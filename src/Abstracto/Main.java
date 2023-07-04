package Abstracto;

public class Main {

    public static void main(String[] args) {

        Figura triangulo = new Triangulo("Rojo", 4.0, 5.0);
        Cuadrado cuadrado = new Cuadrado("Azul", 4);


        System.out.println("El color del triandulo es: " + triangulo.getColor());
        System.out.println("El area del triangulo es: " + triangulo.calcularArea());

        System.out.println("El color del cuadrado es: " + cuadrado.getColor());
        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());

        triangulo.muestra1();
        cuadrado.muestra1();

    }

}