package com.lyle.dpb.behaviour.观察者模式.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyle 2024-10-29 22:25
 */
public class Subject {

    private List<Observer> list = new ArrayList<>();

    public void register(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    //通知所有的观察者更新
    public void notifyAllObserver(){
        list.forEach(o->o.update(this));
    }

}