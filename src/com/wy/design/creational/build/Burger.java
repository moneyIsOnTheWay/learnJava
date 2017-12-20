package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:45
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}