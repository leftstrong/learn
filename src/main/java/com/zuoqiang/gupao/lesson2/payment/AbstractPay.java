package com.zuoqiang.gupao.lesson2.payment;

public abstract class AbstractPay implements IPayment,IAbroadPayment {
    @Override
    public double getExchange(String country) {
        return 1;
    }

}
