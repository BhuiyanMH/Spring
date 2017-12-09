import java.util.List;
import java.util.Iterator;

public class Employee {

	String empName;
	int empID;
	Address address;
	public List<String> hobbies;

	public Employee() {

		System.out.println("No employee definition");
	}

	public Employee(int ID, String name, Address address, List hobbiesList) {

		this.empName = name;
		this.empID = ID;
		this.address = address;
		this.hobbies = hobbiesList;

	}

	public Employee(int ID, String name, List hobbiesList) {

		this.empName = name;
		this.empID = ID;
		this.hobbies = hobbiesList;
	}

	public Employee(int ID, String name, List hobbiesList, Address address) {

		this.empName = name;
		this.empID = ID;
		this.hobbies = hobbiesList;
		this.address = address;
	}

	public void show() {

		System.out.println("ID: " + empID + "\nName: " + empName + "\n" + address);
		System.out.print("Hobbies: ");
		Iterator<String> listIterator = hobbies.iterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + ", ");

		}
	}

}
