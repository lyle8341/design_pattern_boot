package com.lyle.dpb.behaviour.命令模式.scene2;

/**
 * <p>Invoker(sender)</p>>
 *
 * The invoker class holds a reference to a Command object and triggers its execution through the
 * execute() method
 *
 * @author lyle 2024-10-28 20:59
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}