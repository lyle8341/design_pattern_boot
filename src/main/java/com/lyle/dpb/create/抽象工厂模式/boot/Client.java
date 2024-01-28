package com.lyle.dpb.create.抽象工厂模式.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 总结
 * 这么实现很好扩展，例如我们在加一个学生处理器（studentHandler），只要写2步，就可以使用了。
 * 枚举中增加相关定义
 * 实现父接口
 * 具体handler是给spring管理的，非常方面我们用srping管理的其他类
 * @author lyle 2024-01-28 23:28
 */

@Slf4j
@RestController
public class Client {

    @Autowired
    PersonHandlerFactory personHandlerFactory;

    @GetMapping("/handler")
    public void testHandler(@RequestParam("code") Integer code) {
        log.info("/handler code:{}", code);
        PersonHandler handler = personHandlerFactory.createHandler(code);
        handler.handle();
    }
}