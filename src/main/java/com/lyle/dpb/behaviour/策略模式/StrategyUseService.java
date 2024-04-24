package com.lyle.dpb.behaviour.策略模式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author lyle 2021-12-30 11:35 上午
 */
@Component
public class StrategyUseService implements ApplicationContextAware {

    private final Map<FileTypeResolveEnum, IFileStrategy> iFileStrategyMap = new ConcurrentHashMap<>();

    //把不同策略放到map
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, IFileStrategy> beansOfType = applicationContext.getBeansOfType(IFileStrategy.class);
        beansOfType.values().forEach(t-> iFileStrategyMap.put(t.gainFileType(), t));
    }

    public void resolveFile(FileTypeResolveEnum fileTypeResolveEnum, Object param){
        IFileStrategy iFileStrategy = iFileStrategyMap.get(fileTypeResolveEnum);
        if(null != iFileStrategy){
            iFileStrategy.resolve(param);
        }
    }
}