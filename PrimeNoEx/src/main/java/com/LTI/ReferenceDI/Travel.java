package com.LTI.ReferenceDI;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Travel {

	public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("ForVehicle.xml");
        Vehicle bean= (Vehicle) context.getBean("travel");
        bean.move();
        context.close();
    }

}
