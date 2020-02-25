package com.zuoqiang.gupao.lesson2;

import com.zuoqiang.gupao.lesson2.factory.*;
import com.zuoqiang.gupao.lesson2.payment.IPayment;

public class PaymentTest {

    public static void main(String[] args) {
        IPayment payment;
        payment = PayFactoryHoder.getPaymentFactory(ALPayFactory.class).createPayment();
        System.out.println(payment.getPayName() + "is created");
        payment = PayFactoryHoder.getPaymentFactory(JDPayFactory.class).createPayment();
        System.out.println(payment.getPayName() + "is created");
        payment = PayFactoryHoder.getPaymentFactory(YLPayFactory.class).createPayment();
        System.out.println(payment.getPayName() + "is created");
        payment = PayFactoryHoder.getPaymentFactory(WXPayFactory.class).createPayment();
        System.out.println(payment.getPayName() + "is created");
        payment = PayFactoryHoder.getPaymentFactory(TLPayFactory.class).createPayment();
        System.out.println(payment.getPayName() + "is created");
    }
}
