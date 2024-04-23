package com.lyle.dpb.structural.装饰模式.use;

/**
 * @author lyle 2024-04-20 21:39
 */
public class Client {

    public static void main(String[] args) {
        INotifier notifier = new Notifier();
        //notifier.send("明天有雨，带上雨伞");

        BaseDecorator sms = new SmsDecorator(notifier);
        //sms.send("明天有雨，带上雨伞");

        BaseDecorator slack = new SlackDecorator(sms);
        //slackDecorator.send("明天有雨，带上雨伞");

        BaseDecorator facebook = new FacebookDecorator(slack);
        facebook.send("明天有雨，带上雨伞");
    }
}