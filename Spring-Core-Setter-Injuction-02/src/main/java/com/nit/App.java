package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class App {
    public static void main(String[] args) {
       
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Student std = context.getBean(Student.class);
    	
    	std.display();
    }
}
