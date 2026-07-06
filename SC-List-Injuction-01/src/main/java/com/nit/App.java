package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.FoodCart;

public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	FoodCart foodCart = context.getBean(FoodCart.class);
    	
    	System.out.println(foodCart.toString());

    }
}
