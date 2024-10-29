package com.lyle.dpb.behaviour.命令模式.scene2;

/**
 * @author lyle 2024-10-28 20:57
 */
public class ChangeChannelCommand implements Command {

    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}