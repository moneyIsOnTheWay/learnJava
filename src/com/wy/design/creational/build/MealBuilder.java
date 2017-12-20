package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:49
 * 创建一个 MealBuilder 类，实际的 builder类负责创建 Meal 对象
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
