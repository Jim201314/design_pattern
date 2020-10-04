package com.laobaozi.factory;

import com.laobaozi.factory.iface.Human;

/**
 * 黄色人种，这个翻译的不准确，将就点吧
 */
public class YellowHuman implements Human {

    public void cry() {
        System.out.println("黄色人种会哭");
    }

    public void laugh() {
        System.out.println("黄色人种会大笑，幸福呀！");
    }

    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节");
    }
}
