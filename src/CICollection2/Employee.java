package CICollection2;

import java.util.List;

public class Employee {
	private String name;
	private int id;
	private List<Detail> languages;
 	
	public Employee(int id, String name, List<Detail> languages) {
		this.id = id;
		this.name = name;
		this.languages = languages;
	}
	public void displayInfo() {
		 System.out.println("Id: "+id+"\nName: "+name); 
		 System.out.print("Languages:");
		 for(Detail l : languages) {
			 System.out.print(" "+l);
		 }
	}
}