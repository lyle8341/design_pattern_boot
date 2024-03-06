package com.lyle.dpb.behaviour.观察者模式.applicationScene;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * @author lyle 2024-03-06 22:48
 */
@Component
public class SmsNotificationListener implements ApplicationListener<PurchaseSuccessEvent> {

    @Override
    public void onApplicationEvent(PurchaseSuccessEvent event) {
        String message = "亲，您的订单 " + event.getOrderId() + " 购买成功！";
        sendSms(event.getBuyerPhone(), message);

        //Object source = event.getSource(); //其二、在listener 中此处可作路由；
    }

    private void sendSms(String buyerPhone, String message) {
        // 在这里实现发送短信的逻辑
        System.out.println("sending SMS to " + buyerPhone + ": " + message);
    }
}