package com.lyle.dpb.structural.外观模式.use;

import com.lyle.dpb.structural.外观模式.unuse.上城区工商局;
import com.lyle.dpb.structural.外观模式.unuse.上城区税务局;
import com.lyle.dpb.structural.外观模式.unuse.上城区质监局;
import com.lyle.dpb.structural.外观模式.unuse.光大银行;
import com.lyle.dpb.structural.外观模式.unuse.工商局;
import com.lyle.dpb.structural.外观模式.unuse.税务局;
import com.lyle.dpb.structural.外观模式.unuse.质监局;
import com.lyle.dpb.structural.外观模式.unuse.银行;

/**
 * @author lyle 2024-04-22 21:48
 */
public class RegisterFacade {

    public void register(){
        工商局 g = new 上城区工商局();
        g.checkName();

        质监局 z = new 上城区质监局();
        z.orgCodeCertificate();

        税务局 s = new 上城区税务局();
        s.taxCertificate();

        银行 y = new 光大银行();
        y.openAccount();
    }
}