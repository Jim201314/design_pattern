package com.laobaozi.strategy.impl;

import com.laobaozi.strategy.iface.IStrategy;

/**
 * 汉中栈道被毁，刘邦军队被困汉中：
 * 张良用计：明修栈道，暗渡陈仓
 */
public class ZhandaoChencang implements IStrategy {

    public void operate() {
        System.out.println("明修栈道，暗渡陈仓");
    }


}
