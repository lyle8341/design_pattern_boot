package com.lyle.dpb.structural.代理模式.staticProxy;

/**
 * @author lyle 2024-04-18 23:01
 */
public class Client {

    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();

    }
}