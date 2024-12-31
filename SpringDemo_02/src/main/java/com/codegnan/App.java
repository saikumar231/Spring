package com.codegnan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegnan.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
       Employee employee=(Employee)context.getBean("emp");
       
       System.out.println(employee);
    }
}
