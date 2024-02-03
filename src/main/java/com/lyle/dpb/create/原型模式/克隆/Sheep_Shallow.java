package com.lyle.dpb.create.原型模式.克隆;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 必须实现 Cloneable
 * @author lyle 2024-02-03 17:28
 */
@Setter
@Getter
public class Sheep_Shallow implements Cloneable {

    private String name;

    private Date birthday;

    /**
     * 浅克隆
     */
    @Override
    public Sheep_Shallow clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Sheep_Shallow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}