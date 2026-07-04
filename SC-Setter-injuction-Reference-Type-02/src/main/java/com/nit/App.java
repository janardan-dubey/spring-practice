package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employe;

public class App {
    public static void main(String[] args) {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Employe employe = context.getBean(Employe.class);
    	
    	System.out.println(employe.toString());
    }
}
