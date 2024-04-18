package com.lyle.dpb.structure.代理模式.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author lyle 2024-04-18 23:08
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);

        //proxy ==> jdk.proxy1.$Proxy0
        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        proxy.bookTicket();
        proxy.sing();
    }
}