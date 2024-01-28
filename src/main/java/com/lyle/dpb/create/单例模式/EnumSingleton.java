package com.lyle.dpb.create.单例模式;

/**
 * 枚举本身就是单例模式。由JVM从根本上提供保障！避免通过反射和序列化的漏洞
 * 无延迟加载
 * @author lyle 2024-01-25 23:22
 */
public enum EnumSingleton {

    /**
     * 定义一个枚举的元素，它就代表了一个实例
     */
    INSTANCE;

    /**
     *
     */
    public void operation(){
        //功能处理
    }

}