package com.zuoqiang.gupao.lesson2.factory;

public abstract class AbstractPayFactory implements IPaymentFactory {
    public AbstractPayFactory(){
        init();
    }

    public void init(){
        System.out.println("AbstractPayFactory is initializing... do something usefull");
    }
}
