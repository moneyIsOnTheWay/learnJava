package com.wy.design.creational;

/**
 * author wy
 * date 17-12-18
 * time 下午8:02
 */
public interface Sex {
    void sex();
}

class Boy implements Sex{
    @Override
    public void sex() {
        System.out.println("boy");
    }
}

class Girl implements Sex{
    @Override
    public void sex() {
        System.out.println("Girl");
    }
}