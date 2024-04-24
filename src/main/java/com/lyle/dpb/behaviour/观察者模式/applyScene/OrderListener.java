package com.lyle.dpb.behaviour.观察者模式.applyScene;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class OrderListener {
	// 异步方法
    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void orderTel(OrderEvent orderEvent) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("接收到订单消息--发送短信，telePhone="
                + orderEvent.getTelePhone() + ", goodsName=" + orderEvent.getGoodsName()  
				+ "== " + LocalDateTime.now());
    }

	// 异步方法
    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void orderEmail(OrderEvent orderEvent) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("接收到订单消息--发送邮件，email="
                + orderEvent.getEmail() + ", goodsName=" + orderEvent.getGoodsName()  + 
				"== " + LocalDateTime.now());
    }
}
