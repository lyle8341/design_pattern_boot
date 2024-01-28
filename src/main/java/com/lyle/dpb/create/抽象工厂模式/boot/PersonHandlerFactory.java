package com.lyle.dpb.create.抽象工厂模式.boot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lyle 2024-01-28 23:21
 */

@Component
public class PersonHandlerFactory implements InitializingBean, ApplicationContextAware {

    /**
     * HashMap对象的key、value值均可为null。
     */
    private static final Map<Integer, PersonHandler> MAP = new HashMap<>();

    private ApplicationContext applicationContext;

    public PersonHandler createHandler(Integer personCode) {
        PersonHandler p = MAP.get(personCode);
        if (p != null) {
            return p;
        }
        throw new IllegalArgumentException("No such PersonHandler by code:" + personCode);
    }

    /**
     * <pre>
     *  InitializingBean接口中 afterPropertiesSet();
     *  作用：用于初始化替代 静态代码块
     * </pre>
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        applicationContext.getBeansOfType(PersonHandler.class)
                .values()
                .forEach(c -> MAP.put(c.getPersonEnum().getCode(), c));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}