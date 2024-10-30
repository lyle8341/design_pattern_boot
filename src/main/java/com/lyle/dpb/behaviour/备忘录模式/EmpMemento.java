package com.lyle.dpb.behaviour.备忘录模式;

/**
 * 备忘录类
 * @author lyle 2024-10-29 23:07
 */
public class EmpMemento {

    private String ename;

    private int age;

    private double salary;

    public EmpMemento(Emp emp) {
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}