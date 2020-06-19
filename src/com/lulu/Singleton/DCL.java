package com.lulu.Singleton;

public class DCL {
    private volatile static DCL instance = null;
    //构造方法私有化
    private DCL(){}

    public static DCL getInstance(){
        if(instance==null){   //多线程来实例化时，过滤掉一部分线程
            synchronized (DCL.class){  //上锁
                if(instance==null)    //再次判断，确保只实例化一次
                    instance=new DCL();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(DCL.getInstance());
            }).start();
        }
    }
}
