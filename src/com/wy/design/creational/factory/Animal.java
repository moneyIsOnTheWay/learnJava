package com.wy.design.creational.factory;

/**
 * author wy
 * date 17-12-18
 * time 下午7:43
 */
public interface Animal {
    void say();
}

class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("i am cat");
    }
}

class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("i am Dog");
    }
}