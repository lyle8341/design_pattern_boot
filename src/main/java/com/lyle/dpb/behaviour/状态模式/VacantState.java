package com.lyle.dpb.behaviour.状态模式;

/**
 * 空闲状态
 *
 * @author lyle 2024-10-29 21:38
 */
public class VacantState implements State {

    @Override
    public void handle() {
        System.out.println("房间空闲，无人");
    }
}