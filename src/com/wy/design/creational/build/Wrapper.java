package com.wy.design.creational.build;

/**
 * author wy
 * date 17-12-18
 * time 下午9:38
 * 创建实现 Packing接口的实体类
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
