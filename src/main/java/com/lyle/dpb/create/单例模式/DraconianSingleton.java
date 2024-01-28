package com.lyle.dpb.create.单例模式;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

/**
 * 延迟加载，方法同步，效率低
 *
 * @author lyle 2024-01-25 22:23
 */
public class DraconianSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = -4059227082347570749L;

    private static DraconianSingleton instance;

    private DraconianSingleton() {
    }

    public static synchronized DraconianSingleton getInstance() {
        if (null == instance) {
            instance = new DraconianSingleton();
        }
        return instance;
    }

    /**
     * 防止反序列化破解
     */
    @Serial
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}