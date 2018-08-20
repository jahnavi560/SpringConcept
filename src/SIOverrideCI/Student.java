package SIOverrideCI;

public class Student {
	private String name;
	private int id;

	public Student(int id, String name) {
		System.out.println("set con");
		this.id= id;
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("set n");
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("set id");
		this.id = id;
	}

	public void displayInfo() {
		 System.out.println(id+" "+name);  
	}
	
}
