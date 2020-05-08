package com.myapplicationdev.android.demoexplicitent;

import java.io.Serializable;

public class Hero implements Serializable {
    private String name;
    private int strength;
    private int technicalProwess;

    public int getTechnicalProwess() {
        return technicalProwess;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }
    public Hero(String name, int strength, int technicalProwess){
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }
}
