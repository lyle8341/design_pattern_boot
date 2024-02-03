package com.lyle.dpb.create.建造者模式.standard;

/**
 * @author lyle 2024-02-03 16:40
 */
public class App {
    public static void main(String[] args) {
        TeslaCarBuilder_Concrete_Builders teslaCarBuilder = new TeslaCarBuilder_Concrete_Builders();
        Director director = new Director(teslaCarBuilder);
        director.buildCar();
        Car_Products teslaCar = teslaCarBuilder.build();
        System.out.println(teslaCar.toString());

        BMWCarBuilder_Concrete_Builders bmwCarBuilder = new BMWCarBuilder_Concrete_Builders();
        director = new Director(bmwCarBuilder);
        director.buildCar();
        Car_Products bmwCar = bmwCarBuilder.build();
        System.out.println(bmwCar.toString());
    }
}