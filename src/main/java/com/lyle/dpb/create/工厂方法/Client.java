package com.lyle.dpb.create.工厂方法;

/**
 * @author lyle 2024-01-28 13:32
 */
public class Client {

    public static void main(String[] args) {
        Product productA = new FactoryA().createProduct();
        productA.doSomething();

        Product productB = new FactoryB().createProduct();
        productB.doSomething();
    }
}