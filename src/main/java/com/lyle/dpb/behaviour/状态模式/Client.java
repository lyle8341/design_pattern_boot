package com.lyle.dpb.behaviour.状态模式;

/**
 * @author lyle 2024-10-29 21:49
 */
public class Client {

    public static void main(String[] args) {
        Room ctx = new Room();
        ctx.setState(new VacantState());

        ctx.setState(new BookedState());
    }

}