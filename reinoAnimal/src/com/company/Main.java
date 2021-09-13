package com.company;

public class Main {

    public static void main(String[] args) {
        Mammals blueWhale = new Mammals("Trader", "Male", true);
        blueWhale.information();
        System.out.printf("\n");

        Reptiles lifeSnake = new Reptiles("Dodger", "Female", false);
        lifeSnake.information();
        System.out.printf("\n");

        Amphibious frogzin = new Amphibious("Mr. Frog","Female",true);
        frogzin.information();
        System.out.printf("\n");

        Birds pintinho = new Birds("piuPiu", "None", false);
        pintinho.information();
        System.out.println();

    }
}
