package com.lyle.dpb.structural.享元模式.chess;

/**
 * 坐标
 * 角色: UnSharedConcreteFlyWeight
 * @author lyle 2024-04-22 22:17
 */
public class Coordinate {

    private int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}