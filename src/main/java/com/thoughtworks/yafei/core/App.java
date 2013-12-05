package com.thoughtworks.yafei.core;

import com.thoughtworks.yafei.Fruit.Fruit;
import com.thoughtworks.yafei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Fruit fruit = (Fruit)applicationContext.getBean("someName");
        boolean isSweet = fruit.isSweet();
        System.out.println(isSweet);
    }
}
