package com.lulu.spring.jdkDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Text {
    public static void main(String[] args) {
        LubanImpl lubanImpl = new LubanImpl();
        Luban lubanProxy = (Luban) Proxy.newProxyInstance(Text.class.getClassLoader(), new Class[]{Luban.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jiaqiang");
                return method.invoke(lubanImpl,args);
            }
        });
        lubanProxy.query("abc");
    }
}
