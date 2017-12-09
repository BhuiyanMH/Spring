import javax.annotation.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloApp {

	public static void main(String[] args) {
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloObj = (HelloWorld)context.getBean("helloWorld");
		helloObj.showMsg();
		
	}

}
