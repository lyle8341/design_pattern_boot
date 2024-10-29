package com.lyle.dpb.behaviour.命令模式.scene2;

/**
 * 真正的命令执行者
 *
 * @author lyle 2024-10-28 20:51
 */
public class TV implements Receiver {

    @Override
    public void turnOn() {
        System.out.println("TV is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is now off");
    }

    public void changeChannel() {
        System.out.println("channel changed");
    }
}