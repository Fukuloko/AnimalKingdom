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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isMating() {
        return mating;
    }

    public void setMating(boolean mating) {
        this.mating = mating;
    }
}


