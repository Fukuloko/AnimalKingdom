package com.company;

import java.sql.SQLOutput;

public class Mammals extends Animal{

    public Mammals(String name, String gender, boolean mating) {
        super(name, gender, "mammal", mating);
    }

    @Override
    public void locomotion() {
        System.out.println("*using paws or legs* andando um caminho árduo");
    }

    @Override
    public void noiseSound() {
        System.out.println("*variousSounds*");
    }

    @Override
    public void information() {
        System.out.println("name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Category: " + getCategory());
        locomotion();
        noiseSound();

        if(isMating()){
            System.out.println("*moan* aaaawwn");
        }else{
            System.out.println("Relaax");
        }
    }
}
