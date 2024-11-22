package com.example.springboot3.factory.ship.v3;

import com.example.springboot3.factory.ship.Ship;

public class OilTankerShipFactory extends ShipFactory {

    @Override
    protected Ship createShip() {
        return new OilTankerShip("OilTankerShip", "15t", "blue");
    }

}
