package com.lyle.dpb.structural.装饰模式.use;

/**
 * 角色：ConcreteComponent
 * @author lyle 2024-04-20 20:32
 */
public class Notifier implements INotifier{

    @Override
    public void send(String message) {
        System.out.println("邮件通知: " + message);
    }
}