package com.lyle.dpb.behaviour.责任链模式.filter;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lyle 2021-12-30 12:05 下午
 */
@Component
public class ChainPatternDemo {

    /**
     * TODO 👍👍👍👍👍👍👍👍👍👍👍👍 牛逼 竟然可以这么干
     * 自动注入各个责任链的对象
     */
    @Autowired
    private List<AbstractHandler> abstractHandlerList;

    private AbstractHandler abstractHandler;

    //spring注入后自动执行，责任链的对象连接起来
    @PostConstruct
    private void initializeChainFilter() {
        for (int i = 0; i < abstractHandlerList.size(); i++) {
            if (i == 0) {
                abstractHandler = abstractHandlerList.get(0);
            } else {
                AbstractHandler currentHander = abstractHandlerList.get(i - 1);
                AbstractHandler nextHander = abstractHandlerList.get(i);
                currentHander.setNextHandler(nextHander);
            }
        }
    }

    //直接调用这个方法使用
    public Response exec(Request request, Response response) {
        abstractHandler.filter(request, response);
        return response;
    }




}