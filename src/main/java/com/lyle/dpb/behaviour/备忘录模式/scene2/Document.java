package com.lyle.dpb.behaviour.备忘录模式.scene2;

/**
 * 源发器类
 *
 * @author lyle 2024-10-30 11:41
 */
public class Document {

    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //保存
    public DocMemento save() {
        return new DocMemento(this);
    }

    public void rollback(MementoStack stack) {
        DocMemento docMemento = stack.pop();
        if (null != docMemento) {
            this.content = docMemento.getContent();
        } else {
            System.out.println("已退到墙角了，不能再退");
        }
    }
}