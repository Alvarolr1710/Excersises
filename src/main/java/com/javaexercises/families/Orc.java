package com.javaexercises.families;

import com.javaexercises.Characters;

import static com.javaexercises.enums.FamilyEnum.ORC;

public class Orc extends Characters {

    public Orc() {
        this.family = ORC.label;
    }

    @Override
    public void walk(int xAxis, int yAxis) {

    }

    @Override
    public void attack() {

    }
}
