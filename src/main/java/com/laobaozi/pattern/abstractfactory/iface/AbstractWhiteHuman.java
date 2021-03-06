package com.laobaozi.abstractfactory.iface;

public abstract class AbstractWhiteHuman extends Human {

    public void cry() {
        System.out.println("白色人种会哭");
    }

    public void laugh() {
        System.out.println("白色人种会大笑，幸福呀！");
    }

    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节");
    }
}
