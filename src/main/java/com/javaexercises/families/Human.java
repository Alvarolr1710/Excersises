package com.javaexercises.families;

import com.javaexercises.Characters;

import static com.javaexercises.enums.FamilyEnum.HUMAN;

public class Human extends Characters {

    public Human() {
        this.family = HUMAN.label;
    }

    @Override
    public void attack() {

    }
}
