package com.wy.design.creational.prototype;

/**
 * author wy
 * date 17-12-20
 * time 上午9:28
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
