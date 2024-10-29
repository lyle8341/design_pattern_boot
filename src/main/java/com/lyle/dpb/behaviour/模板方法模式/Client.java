package com.lyle.dpb.behaviour.模板方法模式;

/**
 * @author lyle 2024-10-28 21:42
 */
public class Client {

    public static void main(String[] args) {
        BankTemplateMethod template = new DrawMoney();
        template.process();

        BankTemplateMethod save = new BankTemplateMethod() {

            @Override
            protected void transact() {
                System.out.println("我要存钱！！！");
            }
        };

        save.process();
    }

}