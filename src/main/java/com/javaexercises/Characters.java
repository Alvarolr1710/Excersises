package com.javaexercises;

import com.javaexercises.behaviour.Behaviour;
import com.javaexercises.utils.Position;

public abstract class Characters implements Behaviour {

    protected String family;
    private String name;
    private String gender;
    private String weapon;
    private Position position = new Position();

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void walk(int xAxis, int yAxis) {
        position.setxAxis(position.getxAxis() + xAxis);
        position.setyAxis(position.getyAxis() + yAxis);
    }

    @Override
    public String toString() {
        return "Character info: {" +
                "\n  family: " + family +
                "\n  name: " + name +
                "\n  gender: " + gender +
                "\n  weapon: " + weapon +
                "\n  position: (" + position.getxAxis() + "," + position.getyAxis() + ")" +
                "\n}";
    }

}
