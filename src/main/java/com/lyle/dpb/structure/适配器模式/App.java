package com.lyle.dpb.structure.适配器模式;

/**
 * @author lyle 2024-02-05 23:10
 */
public class App {

    public static void main(String[] args) {
        long exp = 5;
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        String str = exp + " squared equals ";
        str += target.getSquared(exp);
        System.out.println(str);


        //==========
        Target t = new Adapter2();
        long squared = t.getSquared(exp);
        System.out.println("squared = " + squared);

    }
}