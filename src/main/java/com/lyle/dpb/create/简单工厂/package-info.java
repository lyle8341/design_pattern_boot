/**
 * 简单工厂模式也叫<b><i>静态工厂方法（Static Factory Method）模式</i></b>
 * 定义：
 * <ol>
 * <li>在简单工厂模式中，可以根据参数的不同返回不同类的实例</li>
 * <li>只有唯一工厂（简单工厂）</li>
 * <li>缺点：违背开闭原则，如果需要新增其他产品类，就必须在工厂类中新增if-else逻辑判断</li>
 * <li>适用于业务简单，产品固定不会经常改变工厂类的情况</li>
 * <li>
 *  <pre>
 * {@code
 *  java.text.DateFormat#get(LocaleProviderAdapter, int, int, Locale)
 * }
 *  </pre>
 * </li>
 * </ol>
 *
 * <h2>包含角色：</h2>
 * <ul>
 *     <li>Factory：工厂角色</li>
 *     <li>Product：抽象产品角色</li>
 *     <li>ConcreteProduct：具体产品角色</li>
 * </ul>
 *
 * <img src = "https://design-patterns.readthedocs.io/zh-cn/latest/_images/SimpleFactory.jpg" alt="https://design-patterns.readthedocs.io/zh-cn/latest/creational_patterns/simple_factory.html">
 * @author lyle 2024-01-26 23:43
 */
package com.lyle.dpb.create.简单工厂;
