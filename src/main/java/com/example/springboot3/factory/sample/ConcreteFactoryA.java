package com.example.springboot3.factory.sample;

public class ConcreteFactoryA extends AbstractFactory {

    @Override
    protected IProduct createProduct() {
        return new ConcreteProductA();
    }

}
