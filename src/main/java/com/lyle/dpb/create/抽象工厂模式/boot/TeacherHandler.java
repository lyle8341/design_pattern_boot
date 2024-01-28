package com.lyle.dpb.create.抽象工厂模式.boot;

import org.springframework.stereotype.Component;

/**
 * @author lyle 2024-01-28 23:20
 */
@Component
public class TeacherHandler implements PersonHandler {
    @Override
    public PersonEnum getPersonEnum() {
        return PersonEnum.TEACHER;
    }

    @Override
    public boolean handle() {
        System.out.println("老师校验器工作~~~~");
        // 写自己的校验逻辑
        return true;
    }
}