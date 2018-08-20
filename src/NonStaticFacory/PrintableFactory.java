package NonStaticFacory;

public class PrintableFactory {
	public  Printable getPrint() {
		return new B();
	}
}
