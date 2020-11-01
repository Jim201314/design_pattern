package com.laobaozi.abstractfactory;

import com.laobaozi.abstractfactory.config.HumanEnum;
import com.laobaozi.abstractfactory.iface.Human;

public class FemaleHumanFactory extends AbstractHumanFactory {
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }

    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
