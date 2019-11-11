package com.LTI.ReferenceDI;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AssignMain
{

	public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("ForVehicle.xml");
        EmployeeDet v=(EmployeeDet) context.getBean("car");
        v.move();
        Employee m=(Employee) context.getBean("veh");
        m.salary();
        context.close();
    }

}
