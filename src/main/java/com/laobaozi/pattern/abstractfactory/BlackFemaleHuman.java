package com.laobaozi.abstractfactory;

import com.laobaozi.abstractfactory.iface.AbstractBlackHuman;

/**
 * 女性黑种人
 */
public class BlackFemaleHuman extends AbstractBlackHuman {
    public void sex() {
        System.out.println("该黑种人的性别为女...");
    }
}
