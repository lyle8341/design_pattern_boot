package com.lyle.dpb.behaviour.备忘录模式.scene2;

import java.util.Stack;

/**
 * 负责人类
 *
 * @author lyle 2024-10-30 11:47
 */
public class MementoStack {

    //存储备忘录对象
    private Stack<DocMemento> stack = new Stack<>();

    public void push(DocMemento docMemento) {
        stack.push(docMemento);
    }

    public DocMemento pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }


}