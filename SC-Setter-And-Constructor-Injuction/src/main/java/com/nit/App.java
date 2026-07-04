package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Project;

public class App {
    public static void main(String[] args) {

    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Project project = context.getBean(Project.class);
    	
    	System.out.println(project.toString());
    }
}
