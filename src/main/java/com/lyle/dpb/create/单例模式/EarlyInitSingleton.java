package com.lyle.dpb.create.单例模式;

import com.lyle.dpb.common.ThreadSafe;

/**
 * 效率高，不能延迟加载
 *
 * @author lyle 2024-01-25 21:45
 */
@ThreadSafe
public class EarlyInitSingleton {

    /**
     * 类初始化时，立即加载这个对象！由于加载类时，天然线程安全的
     */
    private static final EarlyInitSingleton instance = new EarlyInitSingleton();//类装载时初始化

    private EarlyInitSingleton() {
    }

    public static EarlyInitSingleton getInstance() {
        return instance;
    }
}