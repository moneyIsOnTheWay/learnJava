package com.wy.design.creational.singleton;

/**
 * author wy
 * date 17-12-17
 * time 下午11:05
 * 线程安全，高效率单例模式
 * 1、单例类只能有一个实例。
 * 2、单例类必须自己创建自己的唯一实例。
 * 3、单例类必须给所有其他对象提供这一实例。
 */
public class SingleTon {
    private volatile static SingleTon singleTon;

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
