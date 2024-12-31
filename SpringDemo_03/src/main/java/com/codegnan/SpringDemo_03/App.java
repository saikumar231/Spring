package com.codegnan.SpringDemo_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegnan.beans.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Order order= (Order)context.getBean(Order.class);
        order.displayOrderDetails();
    }
}
