package com.lyle.dpb.behaviour.迭代器模式;

/**
 * @author lyle 2024-04-24 22:38
 */
public interface Iterator {

    void first();//cursor 指向第一个元素

    void next(); //将cursor 指向下一个元素

    boolean hasNext();//判断是否存在下一个元素

    Object getCurrentObj();
}