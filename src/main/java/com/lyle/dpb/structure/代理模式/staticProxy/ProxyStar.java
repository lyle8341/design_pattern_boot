package com.lyle.dpb.structure.代理模式.staticProxy;

/**
 * @author lyle 2024-04-18 22:55
 */
public class ProxyStar implements Star {

    private final Star realStar;

    public ProxyStar(Star star){
        this.realStar = star;
    }

    @Override
    public void confer() {
        System.out.println("代理人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("代理人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("代理人订票");
    }

    @Override
    public void sing() {
        realStar.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("代理人收钱");
    }
}