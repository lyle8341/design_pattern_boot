package com.lyle.dpb.create.单例模式;

/**
 * 延迟加载，方法同步，效率低
 *
 * @author lyle 2024-01-25 22:23
 */
public class LazySingleton {// DraconianSingleton

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}