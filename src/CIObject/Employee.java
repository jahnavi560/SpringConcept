package CIObject;

public class Employee {
	private String name;
	private int id;
	private Address address;
	
	
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void displayInfo() {
		 System.out.println("Id "+id+"\nName "+name);  
		 System.out.println(address.toString());
	}
	
}
