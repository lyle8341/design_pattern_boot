package com.lyle.dpb.behaviour.中介者模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理
 *
 * @author lyle 2024-10-25 13:25
 */
public class President implements Mediator {

    private Map<String, Colleague> map = new HashMap<>();

    @Override
    public void register(String colleagueName, Colleague colleague) {
        map.put(colleagueName, colleague);
    }

    //下命令
    @Override
    public void command(String colleagueName) {
        map.get(colleagueName).selfAction();
    }
}