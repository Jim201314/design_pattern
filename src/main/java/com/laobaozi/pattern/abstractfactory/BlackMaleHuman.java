package com.laobaozi.abstractfactory;

import com.laobaozi.abstractfactory.iface.AbstractBlackHuman;

public class BlackMaleHuman extends AbstractBlackHuman {

    public void sex() {
        System.out.println("该黑种人的性别为男...");
    }
}
