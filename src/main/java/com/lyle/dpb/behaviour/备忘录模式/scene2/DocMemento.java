package com.lyle.dpb.behaviour.备忘录模式.scene2;

/**
 * 备忘录
 *
 * @author lyle 2024-10-30 11:42
 */
public class DocMemento {

    private String content;

    public DocMemento(Document document){
        this.content = document.getContent();
    }

    public String getContent() {
        return content;
    }
}