package com.lyle.dpb.behaviour.中介者模式.scene2;


public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
