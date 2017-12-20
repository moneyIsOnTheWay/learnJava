package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:46
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}