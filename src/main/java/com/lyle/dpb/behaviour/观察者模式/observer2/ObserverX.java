package com.lyle.dpb.behaviour.观察者模式.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lyle 2024-10-29 22:46
 */
public class ObserverX implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        ConcreteSubject cs = ((ConcreteSubject) o);

        this.myState = (int) arg;
    }

    public int getMyState() {
        return myState;
    }
}