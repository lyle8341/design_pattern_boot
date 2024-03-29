package com.lyle.dpb.create.建造者模式.无建造者模式;

import io.micrometer.common.util.StringUtils;

/**
 * set方式
 *
 * <p>
 * 为了解决{@link _1_ResourcePoolConfig}存在的问题你应该也已经想到了，那就是用 set() 函数来给成员变量赋值，
 * 以替代冗长的构造函数。我们直接看代码，具体如下所示。其中，配置项 name 是必填的，所以我们把它放到构造函数中设置，
 * 强制创建类对象的时候就要填写。其他配置项 maxTotal、maxIdle、minIdle 都不是必填的，所以我们通过 set()
 * 函数来设置，让使用者自主选择填写或者不填写。
 * </p>
 *
 * <h1>使用方式</h1>
 * <pre>
 *    {@code
 *     // ResourcePoolConfig使用举例
 *      ResourcePoolConfig config = new ResourcePoolConfig("dbconnectionpool");
 *      config.setMaxTotal(16);
 *      config.setMaxIdle(8);
 *     }
 * </pre>
 *
 * <h2>如果难度再加大</h2>
 * <ol>
 *     <li>我们刚刚讲到，name 是必填的，所以，我们把它放到构造函数中，强制创建对象的时候就设置。如果必填的配置项有很多，把这些必填配置项都放到构造函数中设置，那构造函数就又会出现参数列表很长的问题。如果我们把必填项也通过 set() 方法设置，那校验这些必填项是否已经填写的逻辑就无处安放了。</li>
 *     <li>除此之外，假设配置项之间有一定的依赖关系，比如，如果用户设置了 maxTotal、maxIdle、minIdle 其中一个，就必须显式地设置另外两个；或者配置项之间有一定的约束条件，比如，maxIdle 和 minIdle 要小于等于 maxTotal。如果我们继续使用现在的设计思路，那这些配置项之间的依赖关系或者约束条件的校验逻辑就无处安放了。</li>
 *     <li>如果我们希望 ResourcePoolConfig 类对象是不可变对象，也就是说，对象在创建好之后，就不能再修改内部的属性值。要实现这个功能，我们就不能在 ResourcePoolConfig 类中暴露 set() 方法。</li>
 * </ol>
 */
public class _2_ResourcePoolConfig {
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;

    public _2_ResourcePoolConfig(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty.");
        }
        this.name = name;
    }

    public void setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("maxTotal should be positive.");
        }
        this.maxTotal = maxTotal;
    }

    public void setMaxIdle(int maxIdle) {
        if (maxIdle < 0) {
            throw new IllegalArgumentException("maxIdle should not be negative.");
        }
        this.maxIdle = maxIdle;
    }

    public void setMinIdle(int minIdle) {
        if (minIdle < 0) {
            throw new IllegalArgumentException("minIdle should not be negative.");
        }
        this.minIdle = minIdle;
    }
    //...省略getter方法...
}