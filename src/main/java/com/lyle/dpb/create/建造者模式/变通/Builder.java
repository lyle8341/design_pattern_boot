package com.lyle.dpb.create.建造者模式.变通;

public abstract class Builder {
    public abstract Builder buildWheel(String wheel);
    public abstract Builder buildEnergy(String energy);
    public abstract Builder buildColor(String color);
    public abstract Car_ConcreteBuilder_Director_Products build();
}
