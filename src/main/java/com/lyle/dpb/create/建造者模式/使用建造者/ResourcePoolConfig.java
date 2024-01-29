package com.lyle.dpb.create.建造者模式.使用建造者;

import io.micrometer.common.util.StringUtils;

/**
 * <pre>
 *     {@code
 *      // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
 *      ResourcePoolConfig config = new ResourcePoolConfig.Builder()
 *         .setName("dbconnectionpool")
 *         .setMaxTotal(16)
 *         .setMaxIdle(10)
 *         .setMinIdle(12)
 *         .build();
 *     }
 * </pre>
 *
 * <div>
 *    <p>实际上，使用建造者模式创建对象，还能避免对象存在无效状态。</p>
 *    <p>
 *        比如我们定义了一个长方形类，如果不使用建造者模式，采用先创建后 set 的方式，那就会导致在第一个 set 之后，
 *        对象处于无效状态。具体代码如下所示
 *        <pre>
 *        {@code
 *         Rectangle r = new Rectange(); // r is invalid
 *         r.setWidth(2); // r is invalid
 *         r.setHeight(3); // r is valid
 *        }
 *        </pre>
 *    </p>
 * </div>
 * <
 */
public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }
    //...省略getter方法...

    //我们将Builder类设计成了ResourcePoolConfig的内部类。
    //我们也可以将Builder类设计成独立的非内部类ResourcePoolConfigBuilder。
    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig build() {
            // 校验逻辑放到这里来做，包括必填项校验、依赖关系校验、约束条件校验等
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("...");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("...");
            }
            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("...");
            }
            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("...");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.minIdle = minIdle;
            return this;
        }
    }
}