package com.lyle.dpb.behaviour.中介者模式;

/**
 * https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java
 *
 * @author lyle 2024-10-23 23:48
 */
public class Client {

    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development dev = new Development(m);
        Financial fin = new Financial(m);

        market.selfAction();
        market.outAction();
    }
}