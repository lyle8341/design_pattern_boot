package com.lyle.dpb.behaviour.观察者模式.applyScene;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.greenrobot.eventbus.EventBus;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
public class EventHandler {

    private final EventBus eventBus;

    private final OrderListener orderListener;

    private final LoginListener loginListener;

    public EventHandler(EventBus eventBus,
            OrderListener orderListener, LoginListener loginListener) {
        this.eventBus = eventBus;
        this.orderListener = orderListener;
        this.loginListener = loginListener;
    }

    /**
     * 注册总线
     */
    @PostConstruct
    public void init() {
        eventBus.register(orderListener);
        eventBus.register(loginListener);
    }

    /**
     * 注销总线
     */
    @PreDestroy
    public void destroy() {
        System.out.println("==========> 注销总线");
        eventBus.unregister(orderListener);
        eventBus.unregister(loginListener);
    }

    /**
     * 发布活动
     * @param obj 事件
     */
    public void eventPost(Object obj) throws InterruptedException {
        eventBus.post(obj);
        System.out.println("分发消息完成");
        TimeUnit.SECONDS.sleep(4);
    }
}
