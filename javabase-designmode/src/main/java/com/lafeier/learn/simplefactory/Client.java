package com.lafeier.learn.simplefactory;

public class Client {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.createFruit();//我要吃一个水果，我不管你怎么造，我就是要个水果
        fruit.eat();

        //完全不关心具体的实现类，面向接口编程
        //更换实现类，跟客户端没关系，解耦
    }
}
