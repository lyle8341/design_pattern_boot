package com.lyle.dpb.create.简单工厂;

/**
 * @author lyle 2024-01-28 12:57
 */
public class Client {

    /**
     * 客户端(client)调用工厂类
     **/
    public static void main(String[] args) {
        SimpleFactory.createProduct("A").doSomething();
        SimpleFactory.createProduct("B").doSomething();
    }

}