package com.lyle.dpb.behaviour.责任链模式.filter.反例;

/**
 * 异常的处理效率比条件判断方式要低很多
 * @author lyle 2021-12-30 11:50 上午
 */
public class Order {

    public void checkNullParam(Object param){
        //参数非空校验
        throw new RuntimeException();
    }

    public void checkSecurity(){
        //安全校验
        throw new RuntimeException();
    }
    public void checkBackList(){
        //黑名单校验
        throw new RuntimeException();
    }
    public void checkRule(){
        //规则拦截
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Order order= new Order();
        try{
            order.checkNullParam(null);
            order.checkSecurity ();
            order.checkBackList();
            order.checkRule();
            System.out.println("order success");
        }catch (RuntimeException e){
            System.out.println("order fail");
        }
    }
}