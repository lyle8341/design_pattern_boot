package com.lyle.dpb.behaviour.模板方法模式;

/**
 * @author lyle 2024-10-28 21:44
 */
public class DrawMoney extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("我要取款！！！");
    }
}