package SICollection;

import java.util.List;

public class Employee {
	private String name;
	private int id;
	private List<String> languages;

	public void displayInfo() {
		System.out.println("Id: " + id + "\nName: " + name);
		System.out.print("Languages:");
		for (String l : languages) {
			System.out.print(" " + l);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
}
