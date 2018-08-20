package CIStringInt;

public class Student {
	private String name;
	private int id;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id) {
		this.id = id;
	}
	public Student( String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		 System.out.println(id+" "+name);  
	}
	
}
