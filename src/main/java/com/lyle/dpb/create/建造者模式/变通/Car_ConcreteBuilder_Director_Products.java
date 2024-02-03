package com.lyle.dpb.create.建造者模式.变通;


/**
 * 将具体建造者ConcreteBuilder、引导者Director、对象Client三种角色合为一种
 * @author lyle 2024-02-03 16:47
 */
public class Car_ConcreteBuilder_Director_Products {

    // 轮子
    private String wheel;
    // 能源
    private String energy;
    // 颜色
    private String color;
    public Car_ConcreteBuilder_Director_Products(){}
    public Car_ConcreteBuilder_Director_Products(CarBuilder carBuilder){
        this.wheel = carBuilder.wheel;
        this.energy = carBuilder.energy;
        this.color = carBuilder.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", energy='" + energy + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * 具体建造者
     */
    public static class CarBuilder extends Builder {
        // 轮子
        private String wheel;
        // 能源
        private String energy;
        // 颜色
        private String color;
        @Override
        public CarBuilder buildWheel(String wheel) {
            this.wheel = wheel;
            return this;
        }

        @Override
        public CarBuilder buildEnergy(String energy) {
            this.energy = energy;
            return this;
        }

        @Override
        public CarBuilder buildColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public Car_ConcreteBuilder_Director_Products build() {
            return new Car_ConcreteBuilder_Director_Products(this);
        }
    }
}