package com.lyle.dpb.behaviour.责任链模式.leave;

/**
 * @author lyle 2024-04-23 23:29
 */
public class Client {


    public static void main(String[] args) {
        LeaveHandler director = new Director("令狐冲");
        LeaveHandler manager = new Manager("宁中则");
        LeaveHandler generalManager = new GeneralManager("岳不群");

        director.setNext(manager);
        manager.setNext(generalManager);


        LeaveRequest lr = new LeaveRequest("林平之",5,"找辟邪剑谱");
        director.handleRequest(lr);

    }
}