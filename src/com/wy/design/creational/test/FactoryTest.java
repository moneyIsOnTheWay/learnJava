package com.wy.design.creational.test;

import com.wy.design.creational.Animal;
import com.wy.design.creational.Factory;

/**
 * author wy
 * date 17-12-18
 * time 下午7:46
 */
public class FactoryTest {
    public static void main(String[] args) {
        Animal animal = Factory.getAnimal("Cat");
        animal.say();
    }

}
