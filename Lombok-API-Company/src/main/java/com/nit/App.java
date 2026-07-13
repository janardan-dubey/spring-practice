package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class App {
    public static void main(String[] args) {
       
    	ApplicationContext ctx = 
    			new ClassPathXmlApplicationContext("application-context.xml");
    	
    	Employee emplpoyee = ctx.getBean(Employee.class);
    	
    	System.out.println(emplpoyee.toString());
    }
}
