package com.lyle.dpb.behaviour.观察者模式.applicationScene;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * 事件源：其一、规定事件由谁来产生；其二、可在listener 中作路由；
 * @author lyle 2024-03-06 22:56
 */
@Service
public class PurchaseService {

    private final ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public PurchaseService(ApplicationEventPublisher applicationEventPublisher){
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void completePurchase(String buyerPhone, String orderId){
        //模拟购买完成的业务逻辑
        System.out.println("抢购成功");
        //发布购买成功事件
        /*
         * 此处的this 即 source
         */
        applicationEventPublisher.publishEvent(new PurchaseSuccessEvent(this, buyerPhone, orderId));
    }

}