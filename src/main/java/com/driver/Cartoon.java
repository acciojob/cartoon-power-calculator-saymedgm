package com.driver;

public class Cartoon {
    private String name;
    private int power;

    public Cartoon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return name + " (Power: " + power + ")";
    }
}