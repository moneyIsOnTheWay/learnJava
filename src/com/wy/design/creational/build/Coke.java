package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:47
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
