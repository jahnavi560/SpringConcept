package StaticFacoryAnother;

public class PrintableFactory {
	public static Printable getPrint() {
		return new B();
	}
}
