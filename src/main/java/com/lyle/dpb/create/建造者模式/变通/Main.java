package com.lyle.dpb.create.建造者模式.变通;

public class Main {
    public static void main(String[] args) {
        Car_ConcreteBuilder_Director_Products car = new Car_ConcreteBuilder_Director_Products.CarBuilder()
                .buildColor("白色")
                .buildEnergy("新能源")
                .buildWheel("四个轮子")
                .build();
        System.out.println(car.toString());
    }
}
