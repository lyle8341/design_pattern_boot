package com.lyle.dpb.structure.装饰模式.use;

/**
 * @author lyle 2024-04-20 21:25
 */
public class SmsDecorator extends BaseDecorator {
    public SmsDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("发送短信: " + message);
    }
}