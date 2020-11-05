package com.javalesson.oop;

public enum Size {

    VERY_BIG("XL"), BIG("L"), AVERAGE("M"), SMALL("S"), VERY_SMALL("XS"), UNDEFINED("");

    Size(String abbriviation){
        this.abbriviation = abbriviation;
    }

    private String abbriviation;

    public String getAbbriviation() {
        return abbriviation;
    }
}
