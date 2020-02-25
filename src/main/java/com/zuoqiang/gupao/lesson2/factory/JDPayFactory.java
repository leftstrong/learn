package com.zuoqiang.gupao.lesson2.factory;

import com.zuoqiang.gupao.lesson2.payment.IPayment;
import com.zuoqiang.gupao.lesson2.payment.JDPay;

public class JDPayFactory extends AbstractPayFactory{
    private static final JDPayFactory instance = new JDPayFactory();
    private JDPayFactory(){}
    @Override
    public IPayment createPayment() {
        return new JDPay();
    }
    public static JDPayFactory getInstance(){
        return instance;
    }
}
