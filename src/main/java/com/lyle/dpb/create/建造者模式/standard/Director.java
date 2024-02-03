package com.lyle.dpb.create.建造者模式.standard;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void buildCar(){
        builder.buildWheel();
        builder.buildColor();
        builder.buildEnergy();
    }
}
