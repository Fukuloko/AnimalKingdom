package com.company;

public class Birds extends Animal implements reino{

    public Birds(String name, String gender, boolean mating) {
        super(name, gender, "bird", mating);
    }

    @Override
    public void locomotion() {
        System.out.println("*voosh* *voosh* Voando ao infinito e além");
    }

    @Override
    public void noiseSound() {
        System.out.println("*Piu* *Piu*");
    }

    @Override
    public void information() {
        System.out.println("name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Category: " + getCategory());
        locomotion();
        noiseSound();
        wife();

        if(isMating()){
            System.out.println("*weird noises*");
        }else{
            System.out.println("Relaax");
        }
    }

    @Override
    public void wife() {
        System.out.println("Wife: reptiles ;)");
    }
}
