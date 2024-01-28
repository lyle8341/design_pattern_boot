package com.lyle.dpb.create.抽象工厂模式;

/**
 * @author lyle 2024-01-27 12:28
 */
public interface Seat {

    void massage();//按摩

}

class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("自动按摩");
    }
}

class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不能按摩");
    }
}