package com.example.springboot3.factory.ship.v1;

import com.example.springboot3.factory.ship.Ship;

public class Main {

    public static void main(String[] args) {
        Ship containerShip = orderShip("ContainerShip", "inpa.naver.com");
        System.out.println(containerShip);

        Ship oilTankerShip = orderShip("OilTankerShip", "inpa.naver.com");
        System.out.println(oilTankerShip);
    }

    public static Ship orderShip(String name, String email) {
        if (name == null) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }

        Ship ship = new Ship();

        ship.name = name;

        if (name.equalsIgnoreCase("ContainerShip")) {
            ship.capacity = "20t";
        } else if (name.equalsIgnoreCase("OilTankerShip")) {
            ship.capacity = "15t";
        }

        if (name.equalsIgnoreCase("ContainerShip")) {
            ship.color = "green";
        } else if (name.equalsIgnoreCase("OilTankerShip")) {
            ship.color = "blue";
        }

        System.out.println(ship.name + " 다 만들었다고 " + email + "로 메일을 보냈습니다.");

        return ship;
    }

}
