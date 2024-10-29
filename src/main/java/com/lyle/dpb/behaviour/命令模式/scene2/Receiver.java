package com.lyle.dpb.behaviour.命令模式.scene2;

/**
 * <p>Receiver-真正的命令执行者</p>
 * The Receiver is the device that knows how to perform the actual operation associated with a command.
 * Receivers understand the specific tasks mentioned in commands.
 *
 * @author lyle 2024-10-28 20:34
 */
public interface Receiver {

    void turnOn();

    void turnOff();

}