package com.lyle.dpb.behaviour.模板方法模式;

/**
 * @author lyle 2024-10-28 21:39
 */
public abstract class BankTemplateMethod {

    private void takeNumber() {
        System.out.println("取号排队");
    }

    protected abstract void transact();//办理具体业务，钩子方法

    private void evaluate() {
        System.out.println("反馈评分");
    }

    //子类不让修改
    public final void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }

}