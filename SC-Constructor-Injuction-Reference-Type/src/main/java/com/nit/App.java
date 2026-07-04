package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Patient;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
     
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Patient patient = context.getBean(Patient.class);
    	
    	System.out.println(patient.toString());
    }
}
