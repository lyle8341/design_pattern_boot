package com.lyle.dpb.behaviour.责任链模式.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *  规则拦截对象
 */
@Component
@Order(4) //校验顺序排第4
public class CheckRuleFilterObject extends AbstractHandler {

    @Override
    public void doFilter(Request request, Response response) {
        //check rule
        System.out.println("check rule");
    }
}