package com.lyle.dpb.create.建造者模式.standard;

public abstract class Builder {
    public abstract void buildWheel();
    public abstract void buildEnergy();
    public abstract void buildColor();
    public abstract Car_Products build();
}
