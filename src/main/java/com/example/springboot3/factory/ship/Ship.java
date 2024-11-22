package com.example.springboot3.factory.ship;

public class Ship {

    public String name;

    public String color;

    public String capacity;

    @Override
    public String toString() {
        return String.format("Ship { name: '%s', color: '%s', logo: '%s' }", name, color, capacity);
    }

}
