package com.lyle.dpb.create.建造者模式.standard;

public class Car_Products {
    // 轮子
    private String wheel;
    // 能源
    private String energy;
    // 颜色
    private String color;
    public Car_Products(){}
    public void setColor(String color) {
        this.color = color;
    }
    public void setEnergy(String energy) {
        this.energy = energy;
    }
    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", energy='" + energy + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
