package com.lyle.dpb.behaviour.观察者模式.applicationScene;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.io.Serial;

/**
 * 事件对象
 * @author lyle 2024-03-06 22:44
 */
@Getter
public class PurchaseSuccessEvent extends ApplicationEvent {

    @Serial
    private static final long serialVersionUID = 7600783675582293403L;

    private final String buyerPhone;
    private final String orderId;

    public PurchaseSuccessEvent(Object source, String buyerPhone, String orderId) {
        super(source);
        this.buyerPhone = buyerPhone;
        this.orderId = orderId;
    }

}