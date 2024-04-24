package com.lyle.dpb.behaviour.责任链模式.leave;

/**
 * 总经理
 *
 * @author lyle 2024-04-23 23:17
 */
public class GeneralManager extends BaseLeaveHandler {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("员工: " + request.getEmpName() + "，请假" + request.getLeaveDays() + "天，理由：" + request.getReason());
            System.out.println("总经理: " + this.name + "， 审批通过！");
        } else {
            System.out.println("fuck：" + request.getEmpName());
        }
    }
}