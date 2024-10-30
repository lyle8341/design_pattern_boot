package com.lyle.dpb.behaviour.备忘录模式.scene1;

/**
 * @author lyle 2024-10-29 23:13
 */
public class Client {

    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Emp emp = new Emp("lyle", 12, 8666.5);
        taker.setMemento(emp.memento());
        System.out.println("emp = " + emp);
        emp.setAge(43);
        emp.setEname("good");
        emp.setSalary(4333.6);
        taker.setMemento(emp.memento());
        System.out.println("emp = " + emp);
        emp.setAge(85);
        emp.setEname("fuck");
        emp.setSalary(8953.6);
        taker.setMemento(emp.memento());
        System.out.println("emp = " + emp);

        //回退
        emp.recovery(taker.undo());
        System.out.println("emp = " + emp);
        emp.recovery(taker.undo());
        System.out.println("emp = " + emp);
        emp.recovery(taker.undo());
        System.out.println("emp = " + emp);

        System.out.println("================= redo =================");
        //重做
        emp.recovery(taker.redo());
        System.out.println("emp = " + emp);
        emp.recovery(taker.redo());
        System.out.println("emp = " + emp);
        emp.recovery(taker.redo());
        System.out.println("emp = " + emp);
    }
}