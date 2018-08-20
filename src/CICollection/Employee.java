package CICollection;

import java.util.List;

public class Employee {
	private String name;
	private int id;
	private List<String> languages;
 	
	public Employee(int id, String name, List<String> languages) {
		this.id = id;
		this.name = name;
		this.languages = languages;
	}
	public void displayInfo() {
		 System.out.println("Id: "+id+"\nName: "+name); 
		 System.out.print("Languages:");
		 for(String l : languages) {
			 System.out.print(" "+l);
		 }
	}
}
