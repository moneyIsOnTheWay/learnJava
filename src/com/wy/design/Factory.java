package com.wy.design;

/**
 * author wy
 * date 17-12-17
 * time 下午11:24
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

interface Animal{
    public void say();
}

class Cat implements Animal{
    @Override
    public void say() {
        System.out.println("i am cat");
    }
}

class Dog implements Animal{
    @Override
    public void say() {
        System.out.println("i am Dog");
    }
}

class FactoryDemo{
    public static void main(String[] args) {
        Animal animal = Factory.getAnimal("Cat");
        animal.say();
    }
}