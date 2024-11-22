package com.example.springboot3.factory.sample;

public class Client {

    public static void main(String[] args) {
        AbstractFactory[] factory = {
                new ConcreteFactoryA(),
                new ConcreteFactoryB()
        };

        IProduct productA = factory[0].createOperation();

        IProduct productB = factory[1].createOperation();
    }

}
