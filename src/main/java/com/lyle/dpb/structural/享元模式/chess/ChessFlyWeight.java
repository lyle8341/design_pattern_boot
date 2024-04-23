package com.lyle.dpb.structural.享元模式.chess;

/**
 * 角色: 享元类
 * @author lyle 2024-04-22 22:16
 */
public interface ChessFlyWeight {

    void setColor(String color);

    String getColor();

    void display(Coordinate coordinate);
}