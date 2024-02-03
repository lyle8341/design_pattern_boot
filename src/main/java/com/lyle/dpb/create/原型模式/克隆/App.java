package com.lyle.dpb.create.原型模式.克隆;

import java.util.Date;

/**
 * @author lyle 2024-02-03 17:46
 */
public class App {

    public static void main(String[] args) {
        Date birthday = new Date();
        Sheep_Shallow ss = new Sheep_Shallow();
        //Sheep_Deep ss = new Sheep_Deep();
        ss.setName("龙门客栈");
        ss.setBirthday(birthday);
        System.out.println("原始对象: " + ss.getName() + " " + ss.getBirthday());
        Sheep_Shallow clone = ss.clone();
        //Sheep_Deep clone = ss.clone();
        System.out.println("克隆对象: " + clone.getName() + " " + clone.getBirthday());

        System.out.println("=== 修改时间 ===");
        birthday.setTime(1707954536584L);
        System.out.println("修改时间后原始对象: " + ss.getName() + " " + ss.getBirthday());
        System.out.println("修改时间后克隆对象: " + clone.getName() + " " + clone.getBirthday());

    }
}