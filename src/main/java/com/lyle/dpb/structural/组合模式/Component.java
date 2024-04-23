package com.lyle.dpb.structural.组合模式;

/**
 * 树形结果使用
 * 抽象组件，定义叶子和容器的共同特点
 *
 * @author lyle 2024-04-20 12:39
 */
public interface Component {

    void operation();
}

//叶子组件，无子节点
interface Leaf extends Component {

}

//Composite 复合
//容器组件
interface Composite extends Component {

    void add(Component c);

    void remove(Component c);

    Component getChild(int index);
}