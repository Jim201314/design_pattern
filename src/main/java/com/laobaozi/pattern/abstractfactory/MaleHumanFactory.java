package com.laobaozi.abstractfactory;

import com.laobaozi.abstractfactory.config.HumanEnum;
import com.laobaozi.abstractfactory.iface.Human;

/**
 * 男性创建工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory {
    //创建一个男性黑种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

    //创建一个男性黑种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    //创建一个男性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
