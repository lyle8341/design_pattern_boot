package com.lyle.dpb.structural.外观模式.unuse;

public class 光大银行 implements 银行 {


    @Override
    public void openAccount() {
        System.out.println("填资料开户...");
    }
}