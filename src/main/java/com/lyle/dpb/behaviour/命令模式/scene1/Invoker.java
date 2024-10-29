package com.lyle.dpb.behaviour.命令模式.scene1;

/**
 * 命令调用者/发起者
 * sender (Invoker)
 * @author lyle 2024-10-28 20:07
 */
public class Invoker {

    //也可以通过容器 List<Command>容纳很多命令对象，进行批处理
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    //业务方法，用于调用命令类的方法
    public void call(){
        command.execute();
    }

}