package com.lyle.dpb.behaviour.命令模式.scene2;

/**
 * 真正的命令执行者
 *
 * @author lyle 2024-10-28 20:53
 */
public class Stereo implements Receiver {

    @Override
    public void turnOn() {
        System.out.println("stereo is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("stereo is now off");
    }

    public void adjustVolume() {
        System.out.println("volume adjusted");
    }
}