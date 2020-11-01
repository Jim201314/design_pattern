package com.laobaozi.abstractfactory;

import com.laobaozi.abstractfactory.iface.AbstractWhiteHuman;

public class WhiteMaleHuman extends AbstractWhiteHuman {
    public void sex() {
        System.out.println("该白种人的性别为男...");
    }
}
