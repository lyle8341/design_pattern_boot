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
public class Sheep_Deep implements Cloneable {

    private String name;

    private Date birthday;

    /**
     * 深克隆
     */
    @Override
    public Sheep_Deep clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            Sheep_Deep sheepDeep = (Sheep_Deep) super.clone();
            sheepDeep.birthday = (Date)this.birthday.clone();//属性也克隆
            return sheepDeep;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}