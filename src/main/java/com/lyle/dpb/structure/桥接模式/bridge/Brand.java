package com.lyle.dpb.structure.桥接模式.bridge;

/**
 * Implementor
 *
 * @author lyle 2024-04-19 22:32
 */
public interface Brand {

    void sale();
}

/**
 * ConcreteImplementor
 */
class Lenovo implements Brand {

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

/**
 * ConcreteImplementor
 */
class Dell implements Brand {

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}