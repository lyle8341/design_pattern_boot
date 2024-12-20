package com.lyle.dpb.behaviour.中介者模式.scene2;

/**
 * @author lyle 2024-10-25 14:31
 */
public class Client {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();
        User u1 = new UserImpl(mediator, "Pankaj");
        User u2 = new UserImpl(mediator, "Lisa");
        User u3 = new UserImpl(mediator, "Saurabh");
        User u4 = new UserImpl(mediator, "David");
        mediator.addUser(u1);
        mediator.addUser(u2);
        mediator.addUser(u3);
        mediator.addUser(u4);

        u1.send("Hi All");
    }
}