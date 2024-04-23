package com.lyle.dpb.structural.享元模式.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lyle 2024-04-22 22:24
 */
public class ChessFlyWeightFactory {

    /**
     * 享元池
     */
    private static final Map<String, ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color) {

        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight ccc = new ConcreteChess(color);
            map.put(color, ccc);
            return ccc;
        }
    }

}