package com.example.springboot3.factory.sample;

public class ConcreteFactoryB extends AbstractFactory {

    @Override
    protected IProduct createProduct() {
        return new ConcreteProductB();
    }

}
