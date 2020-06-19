package com.lulu.Singleton;

public class HungerySingleton {
    //加载的时候就会产生实例对象
    private static HungerySingleton instance = new HungerySingleton();
    private  HungerySingleton(){}

    //返回实例对象
    public static HungerySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(HungerySingleton.getInstance());
            }).start();
        }
    }
}
