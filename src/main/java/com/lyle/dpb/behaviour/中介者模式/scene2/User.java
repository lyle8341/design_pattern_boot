package com.lyle.dpb.behaviour.中介者模式.scene2;

/**
 * Colleague Interface
 *
 * @author lyle 2024-10-25 14:20
 */
public abstract class User {

    protected ChatMediator mediator;

    protected String name;

    public User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}