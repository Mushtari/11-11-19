package com.LTI.ReferenceDI;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Travel {

	public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("ForVehicle.xml");
        Car v=(Car) context.getBean("car");
        v.move();
        MRF m=(MRF) context.getBean("veh");
        m.rotate();
        context.close();
    }

}
