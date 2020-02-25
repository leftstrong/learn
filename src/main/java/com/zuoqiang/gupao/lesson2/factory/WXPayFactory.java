package com.zuoqiang.gupao.lesson2.factory;

import com.zuoqiang.gupao.lesson2.payment.IPayment;
import com.zuoqiang.gupao.lesson2.payment.WXPay;

public class WXPayFactory extends AbstractPayFactory{
    private static final WXPayFactory instance = new WXPayFactory();
    private WXPayFactory(){}
    @Override
    public IPayment createPayment() {
        return new WXPay();
    }
    public static WXPayFactory getInstance(){
        return instance;
    }
}
