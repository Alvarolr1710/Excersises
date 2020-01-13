package com.javaexercises.behaviour;

import com.javaexercises.Characters;

public interface Behaviour {
    void walk(int xAxis, int yAxis);

    boolean attack(Characters player2);

}
