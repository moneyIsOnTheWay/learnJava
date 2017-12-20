package com.wy.design.creational.build;

import java.util.ArrayList;
import java.util.List;

/**
 * author wy
 * date 17-12-18
 * time 下午9:48
 * 创建一个 Meal带有上面定义的 Item 对象。
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
