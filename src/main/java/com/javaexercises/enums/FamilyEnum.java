package com.javaexercises.enums;

public enum FamilyEnum {

    HUMAN("Human"),
    ORC("Orc"),
    ELF("Elf"),
    DEMIWOLF("Demiwolf");

    public final String label;

    FamilyEnum(String label) {
        this.label = label;
    }

}
