package com.lyle.dpb.create.建造者模式.使用建造者;

/**
 * @author lyle 2024-01-29 23:07
 */
public class Client {

    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();

    }
}