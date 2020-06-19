package com.lulu.Singleton;

public class InnerSingleton {
    private InnerSingleton(){}
    private static class InnerDemo{
        private static InnerSingleton instance = new InnerSingleton();
    }
    public static InnerSingleton getInstance(){
        return InnerDemo.instance;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(InnerSingleton.getInstance());
            }).start();
        }
    }
}
