package com.lyle.dpb.structure.代理模式.dynamicProxy;

/**
 * @author lyle 2024-04-18 22:52
 */
public class RealStar implements Star {


    @Override
    public void confer() {
        System.out.println("realStar confer");
    }

    @Override
    public void signContract() {
        System.out.println("realStar signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("realStar bookTicket");
    }

    @Override
    public void sing() {
        System.out.println("刀郎：聊斋");
    }

    @Override
    public void collectMoney() {
        System.out.println("realStar collectMoney");
    }
}