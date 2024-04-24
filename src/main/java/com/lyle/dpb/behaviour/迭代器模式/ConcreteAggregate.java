package com.lyle.dpb.behaviour.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyle 2024-04-24 22:41
 */
public class ConcreteAggregate {

    private List<Object> list = new ArrayList<>();

    public void addObject(Object object) {
        list.add(object);
    }

    public void removeObject(Object object) {
        list.remove(object);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Iterator createIterator() {
        return new ConcreteIterator();
    }


    //TODO 使用内部类定义迭代器，可以直接使用外部类的属性
    private class ConcreteIterator implements Iterator {

        //记录遍历位置
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}