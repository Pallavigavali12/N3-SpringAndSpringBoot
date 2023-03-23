package objectsInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tnsif.literals.SwiftEngine;

public class DIUsingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BeanFactory f=new ClassPathXmlApplicationContext("web.xml");
		Cellphone s=f.getBean("c2",Cellphone.class);
		s.accept();
		

	}

}
