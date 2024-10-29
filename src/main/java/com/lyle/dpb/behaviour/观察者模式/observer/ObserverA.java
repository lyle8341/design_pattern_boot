package com.lyle.dpb.behaviour.观察者模式.observer;

/**
 * @author lyle 2024-10-29 22:32
 */
public class ObserverA implements Observer {

    //myState需要跟目标对象的state保持一致
    private int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Subject subject) {
        this.myState = ((ConcreteSubject) subject).getState();
    }
}