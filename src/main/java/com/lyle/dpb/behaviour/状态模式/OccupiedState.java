package com.lyle.dpb.behaviour.状态模式;

/**
 * 已预定状态
 *
 * @author lyle 2024-10-29 21:38
 */
public class OccupiedState implements State {

    @Override
    public void handle() {
        System.out.println("房间入住中");
    }
}