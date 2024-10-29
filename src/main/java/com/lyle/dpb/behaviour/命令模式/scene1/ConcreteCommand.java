package com.lyle.dpb.behaviour.命令模式.scene1;

/**
 * @author lyle 2024-10-28 20:05
 */
public class ConcreteCommand implements Command {

    //命令的真正执行者
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //自定义逻辑
        receiver.action();
        //自定义逻辑
    }
}