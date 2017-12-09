package org.mhrony.assertive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DraingApp {

	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		/* AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook(); */
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}
}
