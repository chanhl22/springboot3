package com.example.springboot3.factory.ship.v3;

import com.example.springboot3.factory.ship.Ship;

public class OilTankerShip extends Ship {

    OilTankerShip(String name, String capacity, String color) {
        this.name = name;
        this.capacity = capacity;
        this.color = color;
    }

}
