package com.lyle.dpb.create.单例模式;

/**
 * @author lyle 2024-01-25 22:43
 */
public class DclSingleton {

    /**
     *  the field needs to be volatile
     */
    private static volatile DclSingleton instance = null;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton .class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
}