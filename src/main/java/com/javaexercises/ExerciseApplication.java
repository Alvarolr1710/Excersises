package com.javaexercises;

import com.javaexercises.enums.ActionsEnum;

import java.util.Arrays;
import java.util.Scanner;

import static com.javaexercises.utils.CharactersFunctions.*;

public class ExerciseApplication {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Characters player1 = setPlayer(keyboard);
        System.out.println(player1.toString());
        start(keyboard, player1);

    }

    private static void start(Scanner keyboard, Characters player1) {
        Characters player2 = null;
        boolean quit = true;
        do {
            System.out.println("Decide your next action:");
            System.out.println(Arrays.toString(ActionsEnum.values()));
            switch (keyboard.next().toLowerCase()) {
                case "walk":
                    walk(keyboard, player1);
                    break;
                case "attack":
                    System.out.println(player1.getName() + " is attacking...");
                    player2 = generateRandomP2();
                    boolean fight = player1.attack(player2);
                    if (!fight) {
                        gameOverMethod(player2);
                    }
                    break;
                case "quit":
                    quit = false;
                    break;
                default:
                    System.out.println("You selected an invalid action");
                    break;
            }
            System.out.println(player1.toString());
        } while (quit);
    }

    private static void gameOverMethod(Characters player2) {
        System.out.println("Alvaro was kill by: ");
        System.out.println(player2.toString());
        System.out.println("GAME OVER");
        System.exit(0);
    }

}
