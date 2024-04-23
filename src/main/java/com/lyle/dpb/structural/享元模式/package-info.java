/**
 * FlyWeight
 * 内存资源稀缺，如果有很多个完全相同或相似的对象，我们可以通过享元模式，节省内存
 *
 * 享元对象能做到共享的关键是区分了内部状态和外部状态
 * - 内部状态：可以共享，不会随环境变化而变化
 * - 外部状态：不可以共享，会随环境变化而改变
 *
 * <pre>
 * FlyweightFactory:享元工厂类
 *      创建并管理享元对象，享元池一般设计成键值对
 * FlyWeight：抽象享元类
 *      通常是一个接口或抽象类，声明公共方法，这些方法可以向外界提供对象的内部状态，设置外部状态
 * ConcreteFlyWeight:具体享元类
 *      为内部状态提供成员变量进行存储
 * UnsharedConcreteFlyWeight:非共享享元类
 *      不能被共享的子类可以设计为非共享享元类
 * </pre>
 *
 *
 * <a href="https://www.pentalog.com/blog/design-patterns/flyweight-design-patterns/">享元模式应用</a>
 * @author lyle 2024-04-22 21:56
 */
package com.lyle.dpb.structural.享元模式;