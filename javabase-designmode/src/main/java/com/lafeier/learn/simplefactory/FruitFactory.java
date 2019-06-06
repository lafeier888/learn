package com.lafeier.learn.simplefactory;

import java.io.IOException;
import java.util.Properties;

public class FruitFactory {

    public static Fruit createFruit()  {
        Properties properties = new Properties();
        try {
            properties.load(FruitFactory.class.getResourceAsStream("/factoryconfig.properties"));
        } catch (IOException e) {
            System.out.println("加载配置文件失败");
            e.printStackTrace();
        }
        String impl = properties.getProperty("impl");
        Fruit fruit =  null;
        try {
             fruit = (Fruit)Class.forName(impl).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }
}
