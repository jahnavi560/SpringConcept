package StaticFacoryOwn;

public class A {
	public static final A a = new A();

	private A() {
		System.out.println("Pivate Consrucor");
	}

	public static A getA() {
		System.out.println("get A");
		return a;
	}

	public void print() {

		System.out.println("Print of A");
	}

}
