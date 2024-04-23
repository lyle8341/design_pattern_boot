package com.lyle.dpb.behaviour.责任链模式;

/**
 * @author lyle 2024-04-23 23:11
 */
public interface LeaveHandler {

    void setNext(LeaveHandler handler);

    void handleRequest(LeaveRequest request);
}