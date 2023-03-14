package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hard coding
//		Airtel a=new Airtel();
//		a.call();
//		a.msg();
//		
//		Jio b=new Jio();
//		b.call();
//		b.msg();
//		we have a concept of spring ioc 
//		with the help of getbean method to create the bin 
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
//		Airtel a=(Airtel) c.getBean("airtel");
//		a.call();
//		a.msg();
//		Jio b=(Jio) c.getBean("jio");
//		b.call();
//		b.msg();
//		
		Sim s=c.getBean("sim",Sim.class);
		s.call();
		s.msg();
		

	}

}
