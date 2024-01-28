package com.lyle.dpb.create.抽象工厂模式;

/**
 * @author lyle 2024-01-28 11:39
 */
public interface CarFactory {

    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}