package com.javaexercises.enums;

public enum FamilyEnum {

    HUMAN("Human"),
    ORC("Orc"),
    ELF("Elf"),
    DEMIWOLF("Demiwolf");

    private final String label;

    public String getLabel() {
        return label;
    }

    FamilyEnum(String label) {
        this.label = label;
    }

}
