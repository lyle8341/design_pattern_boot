package com.lyle.dpb.behaviour.迭代器模式;

/**
 * @author lyle 2024-04-24 22:54
 */
public class Client {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.addObject("aa");
        aggregate.addObject("bb");
        aggregate.addObject("cc");

        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()){
            Object currentObj = iterator.getCurrentObj();
            System.out.println(currentObj);
            iterator.next();
        }

    }
}