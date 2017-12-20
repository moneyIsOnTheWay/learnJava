package com.wy.design.creational.prototype;

/**
 * author wy
 * date 17-12-20
 * time 上午9:29
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
