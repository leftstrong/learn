package com.zuoqiang.gupao.lesson2.payment;

import com.zuoqiang.gupao.lesson2.common.ResultMsg;

public interface IPayment {
    String getPayName();
    Double getBalance(String AccountNo);
    ResultMsg pay(String AccountNo, double amount);
}
