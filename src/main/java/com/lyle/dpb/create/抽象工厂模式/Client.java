package com.lyle.dpb.create.抽象工厂模式;

/**
 * @author lyle 2024-01-28 11:42
 */
public class Client {


    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();


    }
}