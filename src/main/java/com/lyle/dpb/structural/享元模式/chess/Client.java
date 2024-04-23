package com.lyle.dpb.structural.享元模式.chess;


/**
 * @author lyle 2024-04-22 22:33
 */
public class Client {

    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        System.out.println("chess1 = " + chess1);
        System.out.println("chess2 = " + chess2);

        System.out.println("增加外部状态的处理===============");

        chess1.display(new Coordinate(10, 3));
        chess2.display(new Coordinate(4, 5));


    }
}