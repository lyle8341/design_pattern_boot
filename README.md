# 设计模式在springboot项目中的实战

## GOF(group of four)

### 创建型模式
- 单例模式、工厂模式、抽象工厂模式、建造者模式、原型模式
### 结构性模式
- 适配器模式、桥接模式、装饰器模式、组合模式、外观模式、享元模式、代理模式
### 行为型模式
- 模板方法模式、命令模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式、状态模式、策略模式、职责链模式、访问者模式





## 工厂模式
+ 大部分工厂类都是以“Factory”这个单词结尾的，但也不是必须的，比如 Java 中的DateFormat、Calender。除此之外，工厂类中创建对象的方法一般都是 create 开头，比如代码中的 createParser()，但有的也命名为 getInstance()、createInstance()、newInstance()，有的甚至命名为 valueOf()（比如 Java String 类的 valueOf() 函数）等等，这个我们根据具体的场景和习惯来命名就好。
+ 抽象工厂就像工厂，而工厂方法就像工厂中的某一条产品线
+ 

## 适配器模式
```
java.io.InputStreamReader(InputStream)
java.io.OutputStreamWriter(OutputStream)
```

## SuppressWarnings
> @SuppressWarnings({"serial", "unchecked"})
+ all: this is sort of a wildcard that suppresses all warnings
+ boxing: suppresses warnings related to boxing/unboxing operations
+ unused: suppresses warnings of unused code
+ cast: suppresses warnings related to object cast operations
+ deprecation: suppresses warnings related to deprecation, such as a deprecated class or method
+ restriction: suppresses warnings related to the usage of discouraged or forbidden references
+ dep-ann: suppresses warnings relative to deprecated annotations
+ fallthrough: suppresses warnings related to missing break statements in switch statements
+ finally: suppresses warnings related to finally blocks that don’t return
+ hiding: suppresses warnings relative to locals that hide variables
+ incomplete-switch: suppresses warnings relative to missing entries in a switch statement (enum case)
+ nls: suppresses warnings related to non-nls string literals
+ null: suppresses warnings related to null analysis
+ serial: suppresses warnings related to the missing serialVersionUID field, which is typically found in a Serializable class
+ static-access: suppresses warnings related to incorrect static variable access
+ synthetic-access: suppresses warnings related to unoptimized access from inner classes
+ unchecked: suppresses warnings related to unchecked operations
+ unqualified-field-access: suppresses warnings related to unqualified field access
+ javadoc: suppresses warnings related to Javadoc
+ rawtypes: suppresses warnings related to the usage of raw types
+ resource: suppresses warnings related to the usage of resources of type Closeable
+ super: suppresses warnings related to overriding a method without super invocations
+ sync-override: suppresses warnings due to missing synchronize when overriding a synchronized method