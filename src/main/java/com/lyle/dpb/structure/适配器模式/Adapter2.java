package com.lyle.dpb.structure.适配器模式;

/**
 * 第二种继承方式
 *
 * @author lyle 2024-02-05 23:04
 */
public class Adapter2 extends Adaptee implements Target {

    @Override
    public long getSquared(long exp) {
        return super.getPower(exp, 2);
    }
}