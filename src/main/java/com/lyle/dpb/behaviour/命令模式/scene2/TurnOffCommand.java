package com.lyle.dpb.behaviour.命令模式.scene2;

/**
 * @author lyle 2024-10-28 20:44
 */
public class TurnOffCommand implements Command {

    private Receiver receiver;

    public TurnOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }
}