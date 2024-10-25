package com.lyle.dpb.behaviour.中介者模式;

/**
 * @author lyle 2024-10-25 13:15
 */
public class Development implements Colleague {

    private Mediator m;//持有中介者(总经理)的引用

    public Development(Mediator m) {
        super();
        this.m = m;
        m.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，开发项目");

    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，需要资金支持");
    }
}