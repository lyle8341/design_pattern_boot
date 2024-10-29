package com.lyle.dpb.behaviour.命令模式.scene2;

/**
 * @author lyle 2024-10-28 21:12
 */
public class CommandPatternExample {

    public static void main(String[] args) {
        //create receiver
        TV tv = new TV();
        Stereo stereo = new Stereo();

        //create command objects
        TurnOnCommand turnOnTvCommand = new TurnOnCommand(tv);
        TurnOffCommand turnOffTvCommand = new TurnOffCommand(tv);
        AdjustVolumeCommand adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        ChangeChannelCommand changeChannelTvCommand = new ChangeChannelCommand(tv);

        //create remote control
        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnTvCommand);
        remote.pressButton();

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton();

        remote.setCommand(changeChannelTvCommand);
        remote.pressButton();

        remote.setCommand(turnOffTvCommand);
        remote.pressButton();
    }

}