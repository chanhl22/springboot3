package com.example.springboot3.factory.ship.v3;

import com.example.springboot3.factory.ship.Ship;

public class ContainerShipFactory extends ShipFactory {

    @Override
    protected Ship createShip() {
        return new ContainerShip("ContainerShip", "20t", "green");
    }

}
