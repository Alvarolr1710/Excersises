package com.javaexercises;

import com.javaexercises.utils.Position;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;

import static com.javaexercises.utils.CharactersFunctions.generateRandomP2;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

class ExerciseApplicationTest {

    private Characters character;

    @Test
    void shouldCreateRandomCharacter() {
        character = generateRandomP2();
        assertNotNull(character);
        assertNotNull(character.getName());
        assertNotNull(character.getWeapon());
        assertNotNull(character.getGender());
        assertNotNull(character.getFamily());
    }

    @Test
    void shouldWalkCertainDistance() {
        character = generateRandomP2();
        Position position = newPosition();
        character.walk(2, 2);
        assertNotSame(position.getxAxis(), character.getPosition().getxAxis());
        assertNotSame(position.getyAxis(), character.getPosition().getyAxis());
    }

    @Test
    void shouldConfrontTwoRandomPlayers() {
        generateRandomP2().attack(generateRandomP2());
    }

    private Position newPosition() {
        Position position = new Position();
        position.setxAxis(character.getPosition().getxAxis());
        position.setyAxis(character.getPosition().getyAxis());
        return position;
    }


}