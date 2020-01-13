package com.javaexercises.utils;

import com.github.javafaker.Faker;
import com.javaexercises.Characters;
import com.javaexercises.enums.FamilyEnum;
import com.javaexercises.enums.GenderEnum;
import com.javaexercises.enums.WeaponEnum;
import com.javaexercises.families.Demiwolf;
import com.javaexercises.families.Elf;
import com.javaexercises.families.Human;
import com.javaexercises.families.Orc;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.containsIgnoreCase;

public class CharactersFunctions {

    private static final Random RANDOM = new Random();

    private CharactersFunctions() {
    }

    public static void walk(Scanner keyboard, Characters player1) {
        System.out.println("Select your walking coordinates");
        System.out.print("x coordinates:");
        int xAxis = Integer.parseInt(keyboard.next());
        System.out.print("y coordinates:");
        int yAxis = Integer.parseInt(keyboard.next());
        player1.walk(xAxis, yAxis);
    }

    public static Characters setPlayer(Scanner keyboard) {
        Characters player1 = createNewCharacter(keyboard);
        setPlayerName(keyboard, player1);
        setPlayerGender(keyboard, player1);
        setPlayerWeapon(keyboard, player1);
        return player1;
    }

    private static void setPlayerWeapon(Scanner keyboard, Characters player1) {
        do {
            System.out.println("Please select a valid weapon:");
            System.out.println(Arrays.toString(WeaponEnum.values()));
            player1.setWeapon(keyboard.next());
        } while (!containsIgnoreCase(Arrays.toString(WeaponEnum.values()), player1.getWeapon()));
    }

    private static void setPlayerGender(Scanner keyboard, Characters player1) {
        do {
            System.out.println("Please enter a valid gender:");
            System.out.println(Arrays.toString(GenderEnum.values()));
            player1.setGender(keyboard.next());
        } while (!containsIgnoreCase(Arrays.toString(GenderEnum.values()), player1.getGender()));
    }

    private static void setPlayerName(Scanner keyboard, Characters player1) {
        System.out.println("Welcome \nPlease enter your name:");
        player1.setName(keyboard.next());
        System.out.println("Welcome: " + player1.getName());
    }

    private static Characters createNewCharacter(Scanner keyboard) {
        Characters characters = null;
        do {
            System.out.println("Please enter a valid family:");
            System.out.println(Arrays.toString(FamilyEnum.values()));
            characters = selectYourCharacter(keyboard.next());
        } while (characters == null);
        return characters;
    }

    private static Characters selectYourCharacter(String characterFamily) {
        Characters characters;
        switch (characterFamily.toLowerCase()) {
            case "human":
                characters = new Human();
                break;
            case "orc":
                characters = new Orc();
                break;
            case "elf":
                characters = new Elf();
                break;
            case "demiwolf":
                characters = new Demiwolf();
                break;
            default:
                characters = null;
                System.out.println("Your class selections are invalid");
        }
        return characters;
    }

    public static Characters generateRandomP2() {
        Faker faker = new Faker();
        Characters characters =
                selectYourCharacter(Arrays.asList(FamilyEnum.values()).get(RANDOM.nextInt(FamilyEnum.values().length)).getLabel());
        characters.setName(faker.name().firstName());
        characters.setGender(Arrays.asList(GenderEnum.values()).get(RANDOM.nextInt(GenderEnum.values().length)).getLabel());
        characters.setWeapon(Arrays.asList(WeaponEnum.values()).get(RANDOM.nextInt(WeaponEnum.values().length)).getLabel());
        return characters;
    }

}
