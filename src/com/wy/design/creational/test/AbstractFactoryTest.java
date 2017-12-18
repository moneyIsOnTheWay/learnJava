package com.wy.design.creational.test;

import com.wy.design.creational.abstractfactory.AbstractFactory;
import com.wy.design.creational.factory.Animal;
import com.wy.design.creational.abstractfactory.FactoryProducer;
import com.wy.design.creational.abstractfactory.Sex;

/**
 * author wy
 * date 17-12-18
 * time 下午8:13
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //getAnimalFactory
        AbstractFactory animalFactory = FactoryProducer.getFactory("Animal");
        Animal cat = animalFactory.getAnimal("Cat");
        cat.say();
        Animal dog = animalFactory.getAnimal("Dog");
        dog.say();
        //getSexFactory
        AbstractFactory sexFactory = FactoryProducer.getFactory("Sex");
        Sex boy = sexFactory.getSex("boy");
        boy.sex();
        Sex girl = sexFactory.getSex("girl");
        girl.sex();
    }
}
