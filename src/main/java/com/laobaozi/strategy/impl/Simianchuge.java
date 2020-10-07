package com.laobaozi.strategy.impl;

import com.laobaozi.strategy.iface.IStrategy;

/**
 * * 孙夫人断后，挡住追兵
 */
public class BlockEnemy implements IStrategy {

    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
