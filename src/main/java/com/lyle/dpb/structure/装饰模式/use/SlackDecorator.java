package com.lyle.dpb.structure.装饰模式.use;

/**
 * @author lyle 2024-04-20 21:33
 */
public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("slack 发送消息: " + message);
    }
}