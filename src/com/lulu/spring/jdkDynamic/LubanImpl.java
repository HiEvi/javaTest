package com.lulu.spring.jdkDynamic;

public class LubanImpl implements Luban {
    @Override
    public String query(String string) {
        System.out.println(string);
        return string;
    }
}
