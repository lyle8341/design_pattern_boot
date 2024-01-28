package com.lyle.dpb.create.抽象工厂模式.boot;

/**
 * 抽象产品
 */
public interface PersonHandler {

    /**
     * 枚举
     * @return {@link PersonEnum}
     */
    PersonEnum getPersonEnum();

    /**
     * <pre>
     *   具体的校验逻辑,由子类实现
     *     一般都会携带入参，根据具体的业务需求定义。
     *     这里主要是为了让spring管理，所以不带入参。
     * </pre>
     *
     * @return true or false
     */
    boolean handle();
}