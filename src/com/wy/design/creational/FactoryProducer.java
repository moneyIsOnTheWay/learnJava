package com.wy.design.creational;

/**
 * author wy
 * date 17-12-18
 * time 下午8:11
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equals("Animal")){
            return new AnimalFactory();
        }
        if (choice.equals("Sex")){
            return new SexFactory();
        }
        return null;
    }
}
