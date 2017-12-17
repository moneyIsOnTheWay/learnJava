package com.wy.design.test;

import com.wy.design.SingleTon;

/**
 * author wy
 * date 17-12-17
 * time 下午11:09
 * 线程安全，高效率单例模式
 */
public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getSingleTon();
        singleTon.sayHello("wy");
    }
}
