package com.zuoqiang.gupao.lesson2.factory;

import com.zuoqiang.gupao.lesson2.payment.IPayment;
import com.zuoqiang.gupao.lesson2.payment.YLPay;

public class YLPayFactory extends AbstractPayFactory{
    private static final YLPayFactory instance = new YLPayFactory();
    private YLPayFactory(){}
    @Override
    public IPayment createPayment() {
        return new YLPay();
    }
    public static YLPayFactory getInstance(){
        return instance;
    }
}
