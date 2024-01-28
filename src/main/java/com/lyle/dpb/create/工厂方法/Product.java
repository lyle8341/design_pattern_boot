package com.lyle.dpb.create.工厂方法;

/**
 * 产品接口
 * @author lyle 2024-01-28 13:23
 */
public interface Product {

    void doSomething();

}

/**
 * 具体产品实现
 */
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