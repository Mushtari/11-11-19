package com.LTI.SpringFrmwrkEx;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    private static Scanner sc;

	public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        PrimeInt bean= (PrimeInt) context.getBean("prime");
        sc = new Scanner(System.in);
        bean.primeCheck(sc.nextInt());
        context.close();
    }
}
