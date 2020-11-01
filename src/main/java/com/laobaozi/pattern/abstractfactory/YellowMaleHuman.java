package com.laobaozi.abstractfactory;

import com.laobaozi.abstractfactory.iface.AbstractYellowHuman;

public class YellowMaleHuman extends AbstractYellowHuman {

    public void sex(){
        System.out.println("该黄种人的性别为男...");
    }
}
