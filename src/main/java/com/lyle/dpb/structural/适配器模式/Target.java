package com.lyle.dpb.structural.适配器模式;

/**
 * 现在客户端需要一个求得一个数的平方的函数接口 (target) ，传入一个数，得到它的平方值。
 * 「指数」中的次方是 power
 * 「b 的 n 次方」==「b to the power of n」==「b to the nth power」==「b to the nth」
 * 「36 的平方根乘以 10 等於 60」就是 the square root of 36 times 10 equals 60
 * 「二次方」又称作「平方」，英文是 square。「五的平方」我们就会说 five squared。
 * 「三次方」又称作「立方」，英文是 cube。「五的立方」我们就会说 five cubed。
 *
 * @author lyle 2024-02-05 22:55
 */
public interface Target {

    //「指數」中的次方是 power
    long getSquared(long exp);

}