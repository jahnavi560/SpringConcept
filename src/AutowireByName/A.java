package AutowireByName;

public class A {
	private B b;

	public A() {
		System.out.println("A constructor");
	}
	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("setter in A");
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
