package com.lyle.dpb.behaviour.责任链模式.leave;

import lombok.Getter;

/**
 * @author lyle 2024-04-23 23:11
 */
public abstract class BaseLeaveHandler implements LeaveHandler {

    @Getter
    protected String name;

    //责任链上的后继对象
    protected LeaveHandler nextLeaveHandler;

    public BaseLeaveHandler(String name) {
        this.name = name;
    }

    @Override
    public void setNext(LeaveHandler handler) {
        this.nextLeaveHandler = handler;
    }
}