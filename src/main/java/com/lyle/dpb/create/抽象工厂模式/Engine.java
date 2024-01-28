package com.lyle.dpb.create.抽象工厂模式;

/**
 * @author lyle 2024-01-27 12:24
 */
public interface Engine {

    void run();

    void start();
}

class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("转得快");
    }

    @Override
    public void start() {
        System.out.println("启动快，可以自动起停");
    }
}

class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("转得慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}