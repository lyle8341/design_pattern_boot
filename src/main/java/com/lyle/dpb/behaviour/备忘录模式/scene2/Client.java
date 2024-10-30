package com.lyle.dpb.behaviour.备忘录模式.scene2;

/**
 * @author lyle 2024-10-30 11:52
 */
public class Client {

    public static void main(String[] args) {
        //
        Document doc = new Document();
        //
        MementoStack mementoStack = new MementoStack();

        //
        doc.setContent("状态1");
        mementoStack.push(doc.save());
        System.out.println("doc.getContent() = " + doc.getContent());

        doc.setContent("状态2");
        mementoStack.push(doc.save());
        System.out.println("doc.getContent() = " + doc.getContent());

        doc.setContent("状态3");
        mementoStack.push(doc.save());
        System.out.println("doc.getContent() = " + doc.getContent());

        doc.setContent("状态4");
        System.out.println("doc.getContent() = " + doc.getContent());

        System.out.println("-------------------------------");

        doc.rollback(mementoStack);
        System.out.println("doc.getContent() = " + doc.getContent());
        doc.rollback(mementoStack);
        System.out.println("doc.getContent() = " + doc.getContent());
        doc.rollback(mementoStack);
        System.out.println("doc.getContent() = " + doc.getContent());

        //栈空了，不能再回退
        doc.rollback(mementoStack);
        System.out.println("doc.getContent() = " + doc.getContent());
    }

}