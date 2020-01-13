package com.javaexercises.families;

import com.javaexercises.Characters;

import static com.javaexercises.enums.FamilyEnum.ELF;

public class Elf extends Characters {

    public Elf() {
        this.family = ELF.getLabel();
        setFullPosition(5, 0);
    }

}
