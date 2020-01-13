package com.javaexercises.enums;

public enum WeaponEnum {
    SWORD("Sword"),
    AXE("Axe"),
    LANCE("Lance");

    private final String label;

    public String getLabel() {
        return label;
    }

    WeaponEnum(String label) {
        this.label = label;
    }
}
