package AutowireByConstructor;

public class A {
	private B b;
	public A() {
		System.out.println("A constructor default");
	}
	
	public A(B b) {
		System.out.println("Constuctor A");
		this.b = b;
	}
	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("Setter in A");
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
