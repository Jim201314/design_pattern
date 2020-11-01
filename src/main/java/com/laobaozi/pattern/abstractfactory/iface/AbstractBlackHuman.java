package com.laobaozi.abstractfactory.iface;


public abstract class AbstractBlackHuman extends Human {

    public void cry() {
        System.out.println("黑色人种会哭");
    }

    public void laugh() {
        System.out.println("黑色人种会大笑，幸福呀！");
    }

    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}
