package com.lyle.dpb.behaviour.命令模式.scene1;

/**
 * @author lyle 2024-10-28 20:10
 */
public class Client {

    //避免客户和receiver直接打交道
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(cmd);
        invoker.call();
    }
}