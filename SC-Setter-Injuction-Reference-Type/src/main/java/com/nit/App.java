package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.MotorProperties;
import com.beans.ToyProperties;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       //MotorProperties mp = context.getBean(MotorProperties.class);
       ToyProperties tp = context.getBean(ToyProperties.class);
       
       tp.display();
       
       
    }
}
