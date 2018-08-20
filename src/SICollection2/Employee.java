package SICollection2;

import java.util.List;

public class Employee {
	private String name;
	private int id;
	private List<Detail> languages;

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

	public List<Detail> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Detail> languages) {
		this.languages = languages;
	}

	public void displayInfo() {
		System.out.println("Id: " + id + "\nName: " + name);
		System.out.print("Languages:");
		for (Detail l : languages) {
			System.out.print(" " + l);
		}
	}
}

