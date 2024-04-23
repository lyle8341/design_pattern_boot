package com.lyle.dpb.structural.适配器模式;

/**
 * @author lyle 2024-02-05 23:04
 */
public class Adapter implements Target {

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public long getSquared(long exp) {
        return adaptee.getPower(exp, 2);
    }
}