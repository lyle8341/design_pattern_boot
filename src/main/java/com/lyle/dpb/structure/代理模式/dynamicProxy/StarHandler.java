package com.lyle.dpb.structure.代理模式.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lyle 2024-04-18 23:07
 */
public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        super();
        this.realStar = realStar;
    }

    /**
     * @param proxy 代理对象（Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);）
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object object = null;
        if (method.getName().equals("sing")) {
            method.invoke(realStar, args);
        }
        System.out.println("######");
        return object;
    }
}