package com.javaexercises.enums;

public enum GenderEnum {
    MALE("Male"),
    FEMALE("Female");

    public final String label;

    GenderEnum(String label) {
        this.label = label;
    }
}
