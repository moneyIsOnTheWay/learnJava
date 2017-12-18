package com.wy.design.creational.abstractfactory;

/**
 * author wy
 * date 17-12-18
 * time 下午8:07
 */

public class AnimalFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String animal) {
        if (animal == null){
            return null;
        }
        if (animal.equals("Cat")){
            return new Cat();
        }
        if (animal.equals("Dog")){
            return new Dog();
        }
        return null;
    }

    @Override
   public Sex getSex(String sex) {
        return null;
    }
}
