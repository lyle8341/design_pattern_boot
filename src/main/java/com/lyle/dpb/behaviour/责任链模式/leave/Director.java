package com.lyle.dpb.behaviour.责任链模式.leave;

/**
 * 主任
 *
 * @author lyle 2024-04-23 23:17
 */
public class Director extends BaseLeaveHandler {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("员工: " + request.getEmpName() + "，请假" + request.getLeaveDays() + "天，理由：" + request.getReason());
            System.out.println("主任: " + this.name + "， 审批通过！");
        } else {
            if (this.nextLeaveHandler != null) {
                this.nextLeaveHandler.handleRequest(request);
            }
        }
    }
}