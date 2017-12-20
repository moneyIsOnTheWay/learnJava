package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:48
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}