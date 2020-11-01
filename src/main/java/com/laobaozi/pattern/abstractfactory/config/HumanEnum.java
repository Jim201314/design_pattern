package com.laobaozi.abstractfactory.config;

public enum HumanEnum {

    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.laobaozi.abstractfactory.YellowMaleHuman"),
    YelloFemaleHuman("com.laobaozi.abstractfactory.YellowFemaleHuman"),
    WhiteFemaleHuman("com.laobaozi.abstractfactory.WhiteFemaleHuman"),
    WhiteMaleHuman("com.laobaozi.abstractfactory.WhiteMaleHuman"),
    BlackFemaleHuman("com.laobaozi.abstractfactory.BlackFemaleHuman"),
    BlackMaleHuman("com.laobaozi.abstractfactory.BlackMaleHuman");
    private String value = ""; //定义构造函数，目的是Data(value)类型的相匹配

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
