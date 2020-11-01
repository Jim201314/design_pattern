package com.laobaozi.abstractfactory;

import com.laobaozi.abstractfactory.iface.AbstractWhiteHuman;

/**
 * 女性白种人
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman {
    public void sex() {
        System.out.println("该白种人的性别为女....");
    }
}
