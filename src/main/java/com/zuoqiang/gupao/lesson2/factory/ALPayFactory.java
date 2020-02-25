package com.zuoqiang.gupao.lesson2.factory;


import com.zuoqiang.gupao.lesson2.payment.ALPay;
import com.zuoqiang.gupao.lesson2.payment.IPayment;

public class ALPayFactory extends AbstractPayFactory{
    private static final ALPayFactory instance = new ALPayFactory();
    private ALPayFactory(){}

    @Override
    public IPayment createPayment() {
        return new ALPay();
    }

    public static ALPayFactory getInstance(){
        return instance;
    }
}
