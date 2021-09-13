package com.company;

public class Amphibious extends Animal{

    public Amphibious(String name, String gender, boolean mating) {
        super(name, gender, "Anphibian", mating);
    }

    @Override
    public void locomotion() {
        System.out.println("*spooing* Pulando como se não houvesse amanha");
    }

    @Override
    public void noiseSound() {
        System.out.println("*ribbit* *ribbit*");
    }

    @Override
    public void information(){
        System.out.println("name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Category: " + getCategory());
        locomotion();
        noiseSound();

        if(isMating()){
            System.out.println("*moan* awn");
        }else{
            System.out.println("Relaax");
        }
    }
}

