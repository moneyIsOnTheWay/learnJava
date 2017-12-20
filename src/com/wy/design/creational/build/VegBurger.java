package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:46
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}