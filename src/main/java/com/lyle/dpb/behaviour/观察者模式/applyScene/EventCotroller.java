package com.lyle.dpb.behaviour.观察者模式.applyScene;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyle 2021-12-30 2:57 下午
 */
@RestController
public class EventCotroller {

    @Autowired
    private EventHandler eventHandler;

    @GetMapping("/eventPost")
    public String eventPost() throws Exception{
        LoginEvent loginEvent = new LoginEvent("22222222", "1111@qq.com", "Java实战1111");
        OrderEvent event = new OrderEvent("13751528565", "742457@qq.com", "Java实战");
        eventHandler.eventPost(loginEvent);
        eventHandler.eventPost(event);
        return "ok";
    }
}