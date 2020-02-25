package com.zuoqiang.gupao.lesson2.payment;

import com.zuoqiang.gupao.lesson2.common.ResultMsg;

public interface IAbroadPayment {
    ResultMsg payAbroad(String country, String AccountNo, double amount);
    double getExchange(String country);
}
