package com.lyle.dpb.behaviour.中介者模式;

/**
 * @author lyle 2024-10-25 13:15
 */
public class Financial implements Colleague {

    private Mediator m;//持有中介者(总经理)的引用

    public Financial(Mediator m) {
        super();
        this.m = m;
        m.register("financial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("要多少，给你印多少钞票");

    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，怎么花钱");
    }
}