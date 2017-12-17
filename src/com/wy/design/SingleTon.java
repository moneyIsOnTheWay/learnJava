package com.wy.design;

/**
 * author wy
 * date 17-12-17
 * time 下午11:05
 * 线程安全，高效率单例模式
 */
public class SingleTon {
    private static SingleTon singleTon;

    private SingleTon(){}

    public static SingleTon getSingleTon() {
        if(singleTon == null){
            synchronized (SingleTon.class){
                if(singleTon == null){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

    public void sayHello(String str){
        System.out.println("hello " + str);
    }
}
