package com.lyle.dpb.create.工厂方法;

/**
 * 工厂接口
 * @author lyle 2024-01-28 13:24
 */
public interface AbstractFactory {

    /**
     * 通过这个方法来生成具体产品，这也是为什么叫工厂方法的原因
     */
    Product createProduct();
}

/**
 * 具体工厂实现
 */
class FactoryA implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

class FactoryC implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductC();
    }
}