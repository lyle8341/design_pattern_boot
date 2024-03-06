package com.lyle.dpb.behaviour.观察者模式.applicationScene;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

/**
 * 在Spring的配置中启用事件发布功能
 * @author lyle 2024-03-06 22:51
 */
@Configuration
public class AppConfig {

    @Bean
    public ApplicationEventPublisher applicationEventPublisher() {
        return new GenericApplicationContext();
    }

}