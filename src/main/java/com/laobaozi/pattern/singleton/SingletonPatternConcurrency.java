package com.laobaozi.singleton;

/**
 * 解决了并发的问题
 */
public class SingletonPatternConcurrency {

    private static final SingletonPatternConcurrency singletonPattern= new
            SingletonPatternConcurrency();

    //限制住不能直接产生一个实例
    private SingletonPatternConcurrency(){
    }

    public synchronized static SingletonPatternConcurrency getInstance(){
        return singletonPattern;
    }
}
