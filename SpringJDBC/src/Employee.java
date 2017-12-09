
public class Employee {
	
	private int ID, salary;
	private String name;
	
	public Employee(){
		
	}
	
	public Employee(int iD, int salary, String name) {
		super();
		ID = iD;
		this.salary = salary;
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
