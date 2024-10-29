package com.lyle.dpb.behaviour.观察者模式.observer;

/**
 * @author lyle 2024-10-29 22:34
 */
public class Client {

    public static void main(String[] args) {
        //目标对象
        ConcreteSubject sub = new ConcreteSubject();

        //创建多个观察者
        ObserverA oa = new ObserverA();
        ObserverA ob = new ObserverA();
        ObserverA oc = new ObserverA();

        //注册到目标对象的观察者队伍
        sub.register(oa);
        sub.register(ob);
        sub.register(oc);

        //改变subject
        sub.setState(300);

        //
        System.out.println("oa.getMyState() = " + oa.getMyState());
        System.out.println("ob.getMyState() = " + ob.getMyState());
        System.out.println("oc.getMyState() = " + oc.getMyState());
    }

}