package com.lyle.dpb.structure.装饰模式.use;

/**
 * @author lyle 2024-04-20 21:21
 */
public class BaseDecorator implements INotifier {

    private INotifier notifier;

    public BaseDecorator(INotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}