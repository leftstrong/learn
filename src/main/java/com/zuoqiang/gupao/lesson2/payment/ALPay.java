package com.zuoqiang.gupao.lesson2.payment;

import com.zuoqiang.gupao.lesson2.common.ResultMsg;

/**
 * 支付宝支付
 */
public class ALPay extends AbstractPay {
    @Override
    public ResultMsg payAbroad(String country, String AccountNo, double amount) {
        return null;
    }

    @Override
    public String getPayName() {
        return "ALPay";
    }

    @Override
    public Double getBalance(String AccountNo) {
        return 10000D;
    }

    @Override
    public ResultMsg pay(String AccountNo, double amount) {
        return null;
    }
}
