package com.example.springboot3.factory.ship.v3;

import com.example.springboot3.factory.ship.Ship;
import com.example.springboot3.factory.ship.v2.ShipFactory;

public class Client {

    public static void main(String[] args) {
        Ship containerShip = new ContainerShipFactory().orderShip("inpa.naver.com");
        System.out.println(containerShip);

        Ship oilTankerShip = new OilTankerShipFactory().orderShip("inpa.naver.com");
        System.out.println(oilTankerShip);
    }

}
