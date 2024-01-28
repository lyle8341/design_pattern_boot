package com.lyle.dpb.create.单例模式;

/**
 * 内部静态类(nested static class)
 * <ol>
 *  <li>外部类没有static属性，则不会像饿汉式那样立即加载对象</li>
 *  <li>只有真正调用getInstance(),才会加载静态内部类，加载类是线程安全的。instance是static final类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全</li>
 *  <li>兼备了并发高效和延迟加载</li>
 * </ol>
 * @author lyle 2024-01-25 23:02
 */
public class NSCSingleton {

    private NSCSingleton() {
    }

    private static class InstanceHolder {
        private static final NSCSingleton instance = new NSCSingleton();
    }

    public static NSCSingleton getInstance() {
        return InstanceHolder.instance;
    }


}