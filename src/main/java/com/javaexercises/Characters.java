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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getGender() {
        return gender;
    }

    String getFamily() {
        return family;
    }

    Position getPosition() {
        return position;
    }

    @Override
    public void walk(int xAxis, int yAxis) {
        position.setxAxis(position.getxAxis() + xAxis);
        position.setyAxis(position.getyAxis() + yAxis);
    }

    @Override
    public boolean attack(Characters player2) {
        String player2Weapon = player2.getWeapon();
        System.out.println(this.name + " is fighting with " + player2.name);
        if ((this.weapon.equalsIgnoreCase(SWORD.getLabel()) && player2Weapon.equalsIgnoreCase(AXE.getLabel())) ||
                (this.weapon.equalsIgnoreCase(AXE.getLabel()) && player2Weapon.equalsIgnoreCase(LANCE.getLabel())) ||
                (this.weapon.equalsIgnoreCase(LANCE.getLabel()) && player2Weapon.equalsIgnoreCase(SWORD.getLabel()))) {
            System.out.println(player2.getName() + " is dead");
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

    protected void setFullPosition(int x, int y) {
        this.position.setxAxis(x);
        this.position.setyAxis(y);
    }

}
