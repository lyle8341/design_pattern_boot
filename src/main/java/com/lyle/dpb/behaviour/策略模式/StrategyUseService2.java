package com.lyle.dpb.behaviour.策略模式;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lyle 2021-12-30 11:35 上午
 */
@Component
public class StrategyUseService2 {

    private final Map<FileTypeResolveEnum, IFileStrategy> iFileStrategyMap = new HashMap<>();

    /**
     * TODO 👍👍👍👍👍👍👍👍👍👍👍👍 牛逼 竟然可以这么干
     * 自动注入各个策略
     */
    @Autowired
    private List<IFileStrategy> iFileStrategyList;

    /**
     * TODO  👍👍👍👍👍👍👍👍👍👍👍👍 牛逼  直接获取所有策略类
     * key = @Service的value
     */
    @Resource
    private Map<String, IFileStrategy> rankMap;

    //spring注入后自动执行，把不同策略放到map
    @PostConstruct
    private void putStrategyIntoMap() {
        iFileStrategyList.forEach(
                iFileStrategy -> iFileStrategyMap.put(iFileStrategy.gainFileType(), iFileStrategy));
    }

    public void resolveFile(FileTypeResolveEnum fileTypeResolveEnum, Object param) {
        IFileStrategy iFileStrategy = iFileStrategyMap.get(fileTypeResolveEnum);
        if (null != iFileStrategy) {
            iFileStrategy.resolve(param);
        }
    }
}