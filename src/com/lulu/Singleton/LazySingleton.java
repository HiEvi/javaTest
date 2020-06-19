package com.lulu.Singleton;

public class LazySingleton {
    private static LazySingleton instance=null;
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(null==instance)
            instance = new LazySingleton();
        return instance;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(LazySingleton.getInstance());
            }).start();
        }
    }
}
