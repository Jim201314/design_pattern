package com.laobaozi.strategy.impl;

import com.laobaozi.strategy.iface.IStrategy;

/**
 * 求吴国太开个绿灯,放行
 */

public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }


}
