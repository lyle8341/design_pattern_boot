package com.lyle.dpb.behaviour.观察者模式.observer;

/**
 * @author lyle 2024-10-29 22:28
 */
public class ConcreteSubject extends Subject {

    private int state;

    public void setState(int state) {
        this.state = state;
        //主题对象（目标对象）值发生了变化，请通知所有的观察者
        notifyAllObserver();
    }

    public int getState() {
        return state;
    }


}