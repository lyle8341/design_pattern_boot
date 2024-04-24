package com.lyle.dpb.behaviour.观察者模式.applyScene;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * @author lyle 2021-12-30 1:36 下午
 */
public class SimpleDemo {

    public static void main(String[] args) {
        SimpleDemo main = new SimpleDemo();
        EventBus.getDefault().register(main);
        EventBus.getDefault().post("hello?");
        EventBus.getDefault().post(3);
        EventBus.getDefault().unregister(main);
    }

    @Subscribe
    public void onEvent(Object event) {
        System.out.println("Event: " + event);
    }


}