package com.lyle.dpb.behaviour.中介者模式;

/**
 * @author lyle 2024-10-25 13:15
 */
public class Market implements Colleague {

    private Mediator m;//持有中介者(总经理)的引用

    public Market(Mediator m) {
        super();
        this.m = m;
        m.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑去接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，项目需要资金加持。。。");
        m.command("financial");
    }
}