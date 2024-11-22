package com.example.springboot3.factory.sample;

abstract class AbstractFactory {

    final IProduct createOperation() {
        IProduct product = createProduct();
        product.setting();
        return product;
    }

    abstract protected IProduct createProduct();

}
