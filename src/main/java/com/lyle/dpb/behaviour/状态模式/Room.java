package com.lyle.dpb.behaviour.状态模式;

/**
 * <p>Context角色</p>
 * 如果是银行系统，这个Context类就是账号，根据金额不同，切换不同状态
 * @author lyle 2024-10-29 21:43
 */
public class Room {

    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        //两种方式：一种单独加一个方法，一种直接在修改状态里面执行状态逻辑
        this.state.handle();
    }
}