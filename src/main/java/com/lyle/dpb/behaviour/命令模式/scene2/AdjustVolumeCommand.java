package com.lyle.dpb.behaviour.命令模式.scene2;

/**
 * @author lyle 2024-10-28 20:57
 */
public class AdjustVolumeCommand implements Command {

    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}