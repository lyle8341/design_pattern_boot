package com.lyle.dpb.create.建造者模式.standard;

public class TeslaCarBuilder_Concrete_Builders extends Builder {
    private Car_Products car;
    public TeslaCarBuilder_Concrete_Builders(){
        car = new Car_Products();
    }
    @Override
    public void buildWheel() {
        car.setWheel("四个轮子");
    }

    @Override
    public void buildEnergy() {
        car.setEnergy("电池");
    }

    @Override
    public void buildColor() {
        car.setColor("白色");
    }

    @Override
    public Car_Products build() {
        return car;
    }
}
