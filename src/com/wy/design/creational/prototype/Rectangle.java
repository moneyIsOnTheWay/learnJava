package com.wy.design.creational.prototype;

/**
 * author wy
 * date 17-12-20
 * time 上午9:25
 * 创建扩展了上面抽象类的实体类。
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
