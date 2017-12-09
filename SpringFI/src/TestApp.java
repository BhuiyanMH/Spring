import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Printable printable = (Printable) applicationContext.getBean("p");
		printable.print();
	}

}
