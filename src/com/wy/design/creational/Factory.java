package com.wy.design.creational;

/**
 * author wy
 * date 17-12-18
 * time 下午7:45
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
