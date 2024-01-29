package com.lyle.dpb;

import java.util.*;
import java.util.function.Function;

/**
 * @author lyle 2024-01-28 23:51
 */
public class MapAndFunction {

    // 定义Map结构，key: 算法规则，value: 存放指定的计算方式
    private static final Map<String, Function<List<Integer>, Integer>> calculateMap = new HashMap<>();

    // 静态代码块，初始化Map结构，定义指定算法规则的计算方式
    static {
        calculateMap.put("SUM", list -> list.stream().reduce(0, Integer::sum));
        calculateMap.put("MIN", data -> data.stream().min(Comparator.comparingInt(o -> o)).orElse(null));
        calculateMap.put("MAX", data -> data.stream().max(Comparator.comparingInt(o -> o)).orElse(null));
    }


    private static <T, R> R calculate(T t, Function<T, R> function) {
        return function.apply(t);
    }

    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5);
        Integer min = MapAndFunction.calculateMap.get("MIN").apply(listA);
        Integer max = MapAndFunction.calculateMap.get("MAX").apply(listA);
        Integer sum = MapAndFunction.calculateMap.get("SUM").apply(listA);
        System.out.println("min = " + min + ", max = " + max + ", sum = " + sum);

        Function<List<Integer>, Integer> sumFunc = list -> list.stream().reduce(0, Integer::sum);
        Integer sum2 = MapAndFunction.calculate(Arrays.asList(1, 2, 3, 4, 5), sumFunc);

        Function<List<Integer>, Integer> maxFunc = list -> list.stream().max(Comparator.comparingInt(o -> o)).orElse(null);
        Integer max2 = MapAndFunction.calculate(Arrays.asList(1, 2, 3, 4, 5), maxFunc);

        Function<List<Integer>, Integer> minFunc = list -> list.stream().min(Comparator.comparingInt(o -> o)).orElse(null);
        Integer min2 = MapAndFunction.calculate(Arrays.asList(1, 2, 3, 4, 5), minFunc);

        System.out.println("sum = " + sum + ", min = " + min + ", max = " + max);
    }
}