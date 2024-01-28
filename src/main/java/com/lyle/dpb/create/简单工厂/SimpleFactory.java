package com.lyle.dpb.create.简单工厂;

/**
 * @author lyle 2024-01-28 12:52
 */
public class SimpleFactory {

    /*public static Product createProduct(String productName) {
        Product instance;
        switch (productName) {
            case "A":
                instance = new ProductA();
                break;
            case "B":
                instance = new ProductB();
                break;
            case "C":
                instance = new ProductC();
                break;
            default:
                instance = null;
        }
        return instance;
    }*/

    /**
     * <h1>静态原因</h1>
     * <ul>
     *     <li>不需要使用new的方式创建对象，方便调用</li>
     *     <li>静态方法意味着可以直接获得实例对象，非静态方法只能通过构造方法（一般私有）调用，在工厂类以外不能被访问</li>
     *     <li>对于一些实例化和销毁对象比较敏感的场景，比如数据库连接池，实例化对象能够重复稳定的被使用</li>
     * </ul>
     */
    public static Product createProduct(String productName) {
        return switch (productName) {
            case "A" -> new ProductA();
            case "B" -> new ProductB();
            case "C" -> new ProductC();
            default -> null;
        };
    }

}