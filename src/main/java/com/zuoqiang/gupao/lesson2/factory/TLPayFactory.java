package com.zuoqiang.gupao.lesson2.factory;

import com.zuoqiang.gupao.lesson2.payment.IPayment;
import com.zuoqiang.gupao.lesson2.payment.TLPay;

/**
 * 通联支付工厂类
 */
public class TLPayFactory extends AbstractPayFactory{
    private static final TLPayFactory instance = new TLPayFactory();
    private TLPayFactory(){}
    @Override
    public IPayment createPayment() {
        return new TLPay();
    }
    public static TLPayFactory getInstance(){
        return instance;
    }
}
