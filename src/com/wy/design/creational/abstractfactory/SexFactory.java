package com.wy.design.creational.abstractfactory;

import com.wy.design.creational.factory.Animal;

/**
 * author wy
 * date 17-12-18
 * time 下午8:09
 */
public class SexFactory extends AbstractFactory {
    @Override
   public Sex getSex(String sex) {
        if (sex.equals("boy")){
            return new Boy();
        }
        if (sex.equals("girl")){
            return new Girl();
        }
        return null;
    }

    @Override
   public Animal getAnimal(String animal) {
        return null;
    }
}
