package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:35
 * 创建一个表示食物条目和食物包装的接口。
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
