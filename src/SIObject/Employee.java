package SIObject;

public class Employee {
	private String name;
	private int id;
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Id " + id + "\nName " + name);
		System.out.println(address.toString());
	}

}
