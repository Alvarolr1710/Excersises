package com.javaexercises.enums;

public enum ActionsEnum {

    WALK("walk"),
    ATTACK("attack"),
    QUIT("quit");

    public final String label;

    ActionsEnum(String label) {
        this.label = label;
    }
}
