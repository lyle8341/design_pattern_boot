package com.lyle.dpb.structural.享元模式;

import java.util.concurrent.TimeUnit;

/**
 * @author lyle 2024-04-23 21:31
 */
public class Bqt {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    int a = 10;
    public A(){
        print();
    }
    public void print(){
        System.out.println(a);
    }
}

class B extends A {
    int b = 20;
    public B(){
        print();
    }
    public void print(){
        System.out.println(b);
    }
}