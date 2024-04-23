package com.lyle.dpb.structural.享元模式.chess;

/**
 * @author lyle 2024-04-22 22:20
 */
public class ConcreteChess implements ChessFlyWeight {

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色:" + color + "\t位置: " + coordinate.getX() + ":" + coordinate.getY());
    }
}