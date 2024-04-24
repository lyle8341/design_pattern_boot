package com.lyle.dpb.behaviour.观察者模式.applyScene;

import org.greenrobot.eventbus.Subscribe;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class LoginListener {
	// 同步方法
    @Subscribe
    public void orderTel(LoginEvent loginEvent) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("接收到登录消息++发送短信，telePhone="
                + loginEvent.getTelePhone() + ", goodsName=" + loginEvent.getGoodsName()  
				+ "== " + LocalDateTime.now());
    }

	// 同步方法
	@Subscribe
    public void orderEmail(LoginEvent loginEvent) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("接收到登录消息++发送邮件，email="
                + loginEvent.getEmail() + ", goodsName=" + loginEvent.getGoodsName()  + 
				"== " + LocalDateTime.now());
    }
}
