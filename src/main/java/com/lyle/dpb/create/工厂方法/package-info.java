/**
 * 工厂方法模式（Factory Method Pattern）
 * 定义
 * <ol>
 *     <li>有多个工厂（抽象工厂+多个具体工厂）</li>
 * </ol>
 *
 * <h2>包含角色</h2>
 * <ul>
 *     <li>Product：抽象产品</li>
 *     <li>ConcreteProduct：具体产品</li>
 *     <li>Factory：抽象工厂</li>
 *     <li>ConcreteFactory：具体工厂</li>
 * </ul>
 *
 *
 * <h1使用场景: private Logger logger = LoggerFactory.getLogger(Client.class);</h1>
 * <pre>
 * {@code
 * //简单工厂模式
 * public static Logger getLogger(String name) {
 *     //工厂方法模式的使用
 *     ILoggerFactory iLoggerFactory = getILoggerFactory();
 *     return iLoggerFactory.getLogger(name);
 * }
 * //工厂接口
 * public interface ILoggerFactory {
 *     Logger getLogger(String var1);
 * }
 * //Logger产品接口
 * public interface Logger {
 *     String ROOT_LOGGER_NAME = "ROOT";
 *     ...
 * }
 * }
 *</pre>
 *
 * <img src="https://design-patterns.readthedocs.io/zh-cn/latest/_images/FactoryMethod.jpg" alt="https://design-patterns.readthedocs.io/zh-cn/latest/creational_patterns/factory_method.html" >
 * @author lyle 2024-01-28 12:48
 */
package com.lyle.dpb.create.工厂方法;