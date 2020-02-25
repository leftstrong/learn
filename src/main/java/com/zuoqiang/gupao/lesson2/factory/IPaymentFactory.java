package com.zuoqiang.gupao.lesson2.factory;

import com.zuoqiang.gupao.lesson2.payment.IPayment;

/**
 * 工厂模型
 */
public interface IPaymentFactory {
    IPayment createPayment();
}
