package com.lyle.dpb.behaviour.责任链模式.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 参数校验对象
 **/
@Component
@Order(1) //顺序排第1，最先校验
public class CheckParamFilterObject extends AbstractHandler {

    @Override
    public void doFilter(Request request, Response response) {
        System.out.println("非空参数检查");
    }
}