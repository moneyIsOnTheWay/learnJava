package com.wy.design.creational.factory;

import com.wy.design.creational.factory.Animal;
import com.wy.design.creational.factory.Cat;
import com.wy.design.creational.factory.Dog;

/**
 * author wy
 * date 17-12-18
 * time 下午7:45
 * 工厂模式
 */

public class Factory {
    public static Animal getAnimal(String className){
        Animal animal = null;
        if("Cat".equals(className)){
            animal = new Cat();
        }
        if("Dog".equals(className)){
            animal = new Dog();
        }
        return animal;
    }
}
