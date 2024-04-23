package com.lyle.dpb.structural.外观模式.unuse;

import com.lyle.dpb.structural.外观模式.use.RegisterFacade;

/**
 * @author lyle 2024-04-22 21:44
 */
public class Client {


    public static void main(String[] args) {
        工商局 g = new 上城区工商局();
        g.checkName();
        质监局 z = new 上城区质监局();
        z.orgCodeCertificate();
        税务局 s = new 上城区税务局();
        s.taxCertificate();
        银行 y = new 光大银行();
        y.openAccount();


        new RegisterFacade().register();

    }
}