package com.lyle.dpb.behaviour.观察者模式.observer2;

/**
 * @author lyle 2024-10-29 22:55
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject();

        ObserverX ox1 = new ObserverX();
        ObserverX ox2 = new ObserverX();
        ObserverX ox3 = new ObserverX();

        cs.addObserver(ox1);
        cs.addObserver(ox2);
        cs.addObserver(ox3);

        cs.setState(56);

        System.out.println("ox1.getMyState() = " + ox1.getMyState());
        System.out.println("ox2.getMyState() = " + ox2.getMyState());
        System.out.println("ox3.getMyState() = " + ox3.getMyState());

    }


}