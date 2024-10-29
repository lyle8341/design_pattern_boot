package com.lyle.dpb.behaviour.观察者模式.observer2;

import java.util.Observable;

/**
 * @author lyle 2024-10-29 22:42
 */
public class ConcreteSubject extends Observable {

    private int state;

    public void setState(int state) {
        this.state = state;//目标对象的状态发生了改变

        setChanged();//表示目标对象已经做了更改
        notifyObservers(state);//通知所有的观察者
    }
}