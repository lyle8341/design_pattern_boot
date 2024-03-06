package com.lyle.dpb.behaviour.观察者模式.applicationScene;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyle 2024-03-06 23:00
 */
@RestController
public class PurchaseController {

    @Resource
    private PurchaseService purchaseService;

    @GetMapping("/buy")
    public String buy(){
        purchaseService.completePurchase("18767172922", "323555443");
        return "ok";
    }
}