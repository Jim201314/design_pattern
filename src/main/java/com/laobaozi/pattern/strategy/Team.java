package com.laobaozi.strategy;

import com.laobaozi.strategy.iface.IStrategy;

/**
 * 刘邦的团队，执行策略。
 */
public class Team {

    //构造函数，你要使用那个妙计
    private IStrategy straegy;

    public Team(IStrategy strategy){
        this.straegy = strategy;
    }

    //使用计谋了，看我出招了
    public void operate(){
        this.straegy.operate();
    }
}
