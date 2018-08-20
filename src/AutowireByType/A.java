package AutowireByType;

public class A {
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void displayInfo() {
		b.printB();
		printA();

	}

	public void printA() {
		System.out.println("A class");
	}

}
