package com.laobaozi.strategy.impl;

import com.laobaozi.strategy.iface.IStrategy;

/**
 * * 项羽太厉害了，打不过。
 *   韩信联合四方，十面埋伏，四面楚歌，打败项羽。 项羽乌江自刎。
 */
public class Simianchuge implements IStrategy {

    public void operate() {
        System.out.println("十面埋伏，四面楚歌，打败项羽");
    }
}
