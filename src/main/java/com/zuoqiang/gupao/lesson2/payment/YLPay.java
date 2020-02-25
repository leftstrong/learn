package com.zuoqiang.gupao.lesson2.payment;

import com.zuoqiang.gupao.lesson2.common.ResultMsg;

/**
 * 银联支付
 */
public class YLPay extends AbstractPay {
    @Override
    public ResultMsg payAbroad(String country, String AccountNo, double amount) {
        return null;
    }

    @Override
    public String getPayName() {
        return "YLPay";
    }

    @Override
    public ResultMsg pay(String AccountNo, double amount) {
        return null;
    }
    @Override
    public Double getBalance(String AccountNo) {
        return 10000D;
    }
}
