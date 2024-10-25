package com.lyle.dpb.behaviour.中介者模式;

public interface Mediator {

    void register(String colleagueName, Colleague colleague);

    void command(String colleagueName);

}