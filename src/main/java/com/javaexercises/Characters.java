package com.javaexercises;

import com.javaexercises.behaviour.Behaviour;
import com.javaexercises.utils.Position;

import static com.javaexercises.enums.WeaponEnum.*;

public class Characters implements Behaviour {

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

    public String getGender() {
        return gender;
    }

    public String getWeapon() {
        return weapon;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void walk(int xAxis, int yAxis) {
        position.setxAxis(position.getxAxis() + xAxis);
        position.setyAxis(position.getyAxis() + yAxis);
    }

    @Override
    public boolean attack(Characters player2) {
        String player2Weapon = player2.getWeapon();
        if ((this.weapon.equalsIgnoreCase(SWORD.getLabel()) && player2Weapon.equalsIgnoreCase(AXE.getLabel())) ||
                (this.weapon.equalsIgnoreCase(AXE.getLabel()) && player2Weapon.equalsIgnoreCase(LANCE.getLabel())) ||
                (this.weapon.equalsIgnoreCase(LANCE.getLabel()) && player2Weapon.equalsIgnoreCase(SWORD.getLabel()))) {
            System.out.println(this.name + " won the game");
            return true;
        } else {
            System.out.println(this.name + " is dead");
            return false;
        }
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
