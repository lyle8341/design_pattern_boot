package com.lyle.dpb.behaviour.观察者模式.applyScene;

import java.io.Serializable;

public class OrderEvent implements Serializable {
    private static final long serialVersionUID = 8794979353646765379L;
    private String telePhone;
    private String email;
    private String goodsName;

    public OrderEvent(String telePhone, String email, String goodsName) {
        this.telePhone = telePhone;
        this.email = email;
        this.goodsName = goodsName;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}