package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:47
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
