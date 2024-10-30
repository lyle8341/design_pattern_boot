package com.lyle.dpb.behaviour.备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>负责人类</p>
 * 负责管理备忘录对象
 *
 * @author lyle 2024-10-29 23:11
 */
public class CareTaker {

    private final List<EmpMemento> list = new ArrayList<>();

    private int total = 0;

    public EmpMemento undo() {
        if (total > 1) {
            return list.get(--total - 1);
        }
        return null;
    }

    public EmpMemento redo() {
        if (total < list.size()) {
            return list.get(total++);
        }
        return null;
    }

    public void setMemento(EmpMemento memento) {
        total++;
        list.add(memento);
    }
}