package com.lulu.Singleton;

public class EnumSingleton {
    private EnumSingleton(){}

    private enum EnumInner{
        INSTANCE;
        private  EnumSingleton instance = null;
        EnumInner(){
            this.instance = new EnumSingleton();
        }
        private EnumSingleton getInstance(){
            return instance;
        }
    }

    public static EnumSingleton getInstance(){
        return EnumInner.INSTANCE.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                System.out.println(EnumSingleton.getInstance());
            }).start();
        }
    }
}
