package org.mhrony.assertive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInterfaceTest {
	
	public static void  main(String arge[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape shape = (Shape)context.getBean("triangle");
		shape.draw();
		shape = (Shape)context.getBean("circle");
		shape.draw();
		
		
	}

}
