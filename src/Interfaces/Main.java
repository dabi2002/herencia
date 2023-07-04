package Interfaces;

public class Main {

    public static void main(String[] args) {

        Labrador lobo = new Lobo();
        Labrador doberman = new Doberman();

        System.out.println(lobo.ladrar());
        System.out.println(doberman.ladrar());

    }

}