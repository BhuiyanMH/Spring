import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("EmpBean.xml");
		Employee employee = (Employee) applicationContext.getBean("emp1");
		employee.show();
	}

}
