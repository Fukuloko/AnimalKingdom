package com.company;

public abstract class Animal {
    private String name;
    private String gender;
    private String category;
    private boolean mating;

    public Animal(String name, String gender, String category, boolean mating) {
        this.name = name;
        this.gender = gender;
        this.category = category;
        this.mating = mating;
    }

    public abstract void locomotion();
    public abstract void noiseSound();
    public abstract void information();

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    boolean isMating() {
        return mating;
    }

    private void setMating(boolean mating) {
        this.mating = mating;
    }
}


