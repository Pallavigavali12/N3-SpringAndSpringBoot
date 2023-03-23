package org.tnsif.literals;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiteralExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory f=new ClassPathXmlApplicationContext("bean.xml");
		SwiftEngine s=f.getBean("swift",SwiftEngine.class);
		System.out.println(s);
		System.out.println(s.cost());
		System.out.println(s.display());
		
		



	}

}
