package com.laobaozi.abstractfactory;

import com.laobaozi.abstractfactory.iface.AbstractYellowHuman;

/**
 * 女性黄种人
 */
public class YellowFemaleHuman extends AbstractYellowHuman {

    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }
}
