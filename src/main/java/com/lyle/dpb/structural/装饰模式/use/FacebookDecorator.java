package com.lyle.dpb.structural.装饰模式.use;

/**
 * @author lyle 2024-04-20 21:32
 */
public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("facebook 发送消息:" + message);
    }
}