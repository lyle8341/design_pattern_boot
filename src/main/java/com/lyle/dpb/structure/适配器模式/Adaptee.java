package com.lyle.dpb.structure.适配器模式;

/**
 * 有一个类 (adaptee) 实现了数学中的幂次运算，方法中需要传入两个参数，一个是基数 base ，另外一个是幂次 exp
 *
 * @author lyle 2024-02-05 22:51
 */
public class Adaptee {

    public long getPower(long base, long exp) {
        long result = 1;
        for (int i = 0; i < exp; i++)
            result *= base;
        return result;
    }

}