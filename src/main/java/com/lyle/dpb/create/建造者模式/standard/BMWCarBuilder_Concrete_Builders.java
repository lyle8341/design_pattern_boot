package com.lyle.dpb.create.建造者模式.standard;

public class BMWCarBuilder_Concrete_Builders extends Builder {
    private Car_Products car;
    public BMWCarBuilder_Concrete_Builders(){
        car = new Car_Products();
    }
    @Override
    public void buildWheel() {
        car.setWheel("四个轮子");
    }

    @Override
    public void buildEnergy() {
        car.setEnergy("油箱");
    }

    @Override
    public void buildColor() {
        car.setColor("黑色");
    }

    @Override
    public Car_Products build() {
        return car;
    }

}
