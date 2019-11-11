package com.LTI.SpringFrmwrkEx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld bean= (HelloWorld) context.getBean("helloworldBean");
        bean.printMessage("Hello World Spring 4");
        context.close();
    }
}
