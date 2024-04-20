package com.lyle.dpb.structure.桥接模式.bridge;

/**
 * @author lyle 2024-04-19 23:41
 */
public class Client {

    public static void main(String[] args) {
        //销售联想笔记本
        Brand lenovo = new Lenovo();
        Computer laptop = new Laptop(lenovo);

        laptop.sale();

    }
}