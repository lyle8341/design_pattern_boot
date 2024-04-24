package com.lyle.dpb.behaviour.责任链模式.filter;

/**
 * @author lyle 2021-12-30 11:52 上午
 */
public abstract class AbstractHandler {

    //责任链中的下一个对象
    private AbstractHandler nextHandler;

    //责任链中的下一个对象
    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    /**
     * 具体参数拦截逻辑,给子类去实现
     */
    public void filter(Request request, Response response){
        doFilter(request, response);
        if(getNextHandler() != null){
            getNextHandler().filter(request, response);
        }
    }

    protected abstract void doFilter(Request request, Response response);
}