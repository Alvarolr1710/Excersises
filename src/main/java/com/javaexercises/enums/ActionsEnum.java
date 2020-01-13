package com.javaexercises.enums;

public enum ActionsEnum {

    WALK("walk"),
    ATTACK("attack"),
    QUIT("quit");

    private final String label;

    ActionsEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
