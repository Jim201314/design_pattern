package com.laobaozi.strategy.impl;

import com.laobaozi.strategy.iface.IStrategy;

/**
 * 项羽、范增一武一文太厉害了，打不过。
 * 使用陈平离间计，项羽中计误以为范增在帮助刘邦。范增怒而辞官归隐，路上含愤而死。
 */

public class Lijian implements IStrategy {
    public void operate() {
        System.out.println("陈平离间计， 范增辞官归隐");
    }


}
