package com.wy.design.creational.test;

import com.wy.design.creational.prototype.Shape;
import com.wy.design.creational.prototype.ShapeCache;

/**
 * author wy
 * date 17-12-20
 * time 上午9:33
 * Prototype 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆。
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
