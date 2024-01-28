package com.lyle.dpb.create.抽象工厂模式.boot;

import org.springframework.stereotype.Component;

/**
 * @author lyle 2024-01-28 23:18
 */
@Component
public class HeadmasterHandler implements PersonHandler {

    @Override
    public PersonEnum getPersonEnum() {
        return PersonEnum.HEADMASTER;
    }

    @Override
    public boolean handle() {
        System.out.println("校长校验器工作~~~~");
        // 写自己的校验逻辑
        return true;
    }
}