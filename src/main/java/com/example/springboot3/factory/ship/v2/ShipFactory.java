package com.example.springboot3.factory.ship.v2;

import com.example.springboot3.factory.ship.ContainerShip;
import com.example.springboot3.factory.ship.OilTankerShip;
import com.example.springboot3.factory.ship.Ship;

public class ShipFactory {

    final Ship orderShip(String name, String email) {
        validate(name, email);

        Ship ship = createShip(name);

        sendEmailTo(email, ship);

        return ship;
    }

    private Ship createShip(String name) {
        Ship ship = null;
        if (name.equalsIgnoreCase("ContainerShip")) {
            ship = new ContainerShip();
        } else if (name.equalsIgnoreCase("OilTankerShip")) {
            ship = new OilTankerShip();
        }
        return ship;
    }

    private void validate(String name, String email) {
        if (name == null) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.name + " 다 만들었다고 " + email + "로 메일을 보냈습니다.");
    }

}
