package com.lyle.dpb.behaviour.责任链模式.leave;

/**
 * 经理
 *
 * @author lyle 2024-04-23 23:17
 */
public class Manager extends BaseLeaveHandler {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 10) {
            System.out.println("员工: " + request.getEmpName() + "，请假" + request.getLeaveDays() + "天，理由：" + request.getReason());
            System.out.println("经理: " + this.name + "， 审批通过！");
        } else {
            if (this.nextLeaveHandler != null) {
                this.nextLeaveHandler.handleRequest(request);
            }
        }
    }
}