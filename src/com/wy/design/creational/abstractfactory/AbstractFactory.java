package com.wy.design.creational.abstractfactory;

/**
 * author wy
 * date 17-12-18
 * time 下午8:05
 */
public abstract class AbstractFactory {
  public abstract Sex getSex(String sex);
  public abstract Animal getAnimal(String animal);
}
