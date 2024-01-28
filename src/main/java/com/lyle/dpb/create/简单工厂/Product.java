package com.lyle.dpb.create.简单工厂;

import java.sql.SQLOutput;

/**
 * @author lyle 2024-01-28 12:50
 */
public interface Product {
    void doSomething();
}

class ProductA implements Product {

    @Override
    public void doSomething() {
        System.out.println("I am productA");
    }
}

class ProductB implements Product {

    @Override
    public void doSomething() {
        System.out.println("I am productB");
    }
}

class ProductC implements Product {

    @Override
    public void doSomething() {
        System.out.println("I am productC");
    }
}