package com.zuoqiang.gupao.lesson2.factory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PayFactoryHoder {
    private static Map<Class<? extends AbstractPayFactory>,AbstractPayFactory> factoryMap = new ConcurrentHashMap<>();

    public static IPaymentFactory getPaymentFactory(Class<? extends AbstractPayFactory> clazz){
        IPaymentFactory factory = factoryMap.get(clazz);
        if(null == factory){
            Method method = null;
            try {
                method = clazz.getMethod("getInstance");
                factory = (AbstractPayFactory) method.invoke(null);
            } catch (NoSuchMethodException |IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return factory;
    }
}
