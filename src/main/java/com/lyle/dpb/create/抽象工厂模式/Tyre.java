package com.lyle.dpb.create.抽象工厂模式;

/**
 * @author lyle 2024-01-28 11:37
 */
public interface Tyre {

    void revolve();
}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}

class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转磨损快");
    }
}