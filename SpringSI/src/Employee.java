import org.springframework.web.servlet.config.VelocityConfigurerBeanDefinitionParser;

public class Employee {

	int ID;
	String name;

	public Employee(){
		System.out.println("Default constructor called: Empty initialization");
	}
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void show(){
		
		System.out.println("Name: " + name + "\nID: "+ID);
	}
}
