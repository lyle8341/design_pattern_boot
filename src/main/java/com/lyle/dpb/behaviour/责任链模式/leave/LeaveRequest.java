package com.lyle.dpb.behaviour.责任链模式.leave;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lyle 2024-04-23 23:00
 */
@Getter
@Setter
@AllArgsConstructor
public class LeaveRequest {

    private String empName;

    private int leaveDays;

    private String reason;

}