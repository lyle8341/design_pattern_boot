package com.lyle.dpb.create.抽象工厂模式.boot;

/**
 * @author lyle 2024-01-28 23:14
 */
public enum PersonEnum {

    /**
     * 老师
     */
    TEACHER(10),

    /**
     * 校长
     */
    HEADMASTER(20);

    PersonEnum(int code) {
        this.code = code;
    }

    private final int code;

    public int getCode() {
        return code;
    }
}