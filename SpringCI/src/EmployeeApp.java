import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("EmpBean.xml");
		Employee empObj = (Employee)context.getBean("emp");
		empObj.show();
		
		
		System.out.println("\n\nTesting Bean inhertance: ");
		
		Employee emp1 = (Employee)context.getBean("emp2");
		emp1.show();
	
	}

}
