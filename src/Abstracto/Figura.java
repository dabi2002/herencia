package Abstracto;

public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    public String getColor() {
        return this.color;
    }

    public void muestra1() {
        System.out.println("Estoy mostrando 1.");
    }

}