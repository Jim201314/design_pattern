package com.laobaozi.strategy;

import com.laobaozi.strategy.impl.ZhandaoChencang;
import com.laobaozi.strategy.impl.Simianchuge;
import com.laobaozi.strategy.impl.Lijian;

public class LiuBang {

    /**
     * 刘邦出手了，按之前商量的依次用计
     */
    public static void main(String[] args) {
        Team team;

        //第一计
        System.out.println("-----------栈道被毁，刘邦被困在汉中-------------");
        team = new Team(new ZhandaoChencang()); //拿到妙计
        team.operate(); //执行
        System.out.println("\n\n");

        //范增一文一武太厉害了，打不过，第二计。
        System.out.println("-----------范增，项羽一文一武太厉害了，打不过，第二计-------------");
        team = new Team(new Lijian());
        team.operate(); //执行了第二个
        System.out.println("\n\n");

        //项羽武力值太高，第三计
        System.out.println("-----------项羽武力值太高，第三计-------------");
        team = new Team(new Simianchuge());
        team.operate(); //执行第三计
        System.out.println("\n\n");

        /*
         *  策略模式的好处就是：体现了高内聚低耦合的特性呀。
         */
    }
}