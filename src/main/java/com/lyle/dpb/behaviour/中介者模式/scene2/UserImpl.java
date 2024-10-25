package com.lyle.dpb.behaviour.中介者模式.scene2;

/**
 * @author lyle 2024-10-25 14:27
 */
public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": sending message = " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": received message : " + msg);
    }
}