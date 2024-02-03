/**
 * Builder 模式，中文翻译为建造者模式或者构建者模式，也有人叫它生成器模式
 * <ol>
 *     <li>抽象建造者Builder 建造者的抽象类或者接口，主要用来定义具体建造者需要实现的一些方法。</li>
 *     <li>具体建造者 ConcreteBuilder 具体的建造者，是抽象建造者的实现类。</li>
 *     <li>具体的对象Client 最终想要生成的对象。</li>
 *     <li>引导者Director 实例的生成需要依赖Director角色，Director生成实例不依赖ConcreteBuilder，它只通过调用Builder角色中定义的方法。</li>
 * </ol>
 *
 * @author lyle 2024-01-29 22:40
 */
package com.lyle.dpb.create.建造者模式;