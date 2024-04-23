package q1;

public class Onetwo {

	public static int staticvar = 24;
	public int nonstaticvar = 11;

	public static void staticMeth() {
		System.out.println("Static VAriable" + staticvar);
	}

	public void nonstaticMeth() {
		System.out.println("non static var" + nonstaticvar);
	}

	public static void main(String[] args) {
		Onetwo ob = new Onetwo();
		ob.nonstaticMeth();
		System.out.println("non static var" + ob.nonstaticvar);

		Onetwo.staticMeth();
	}

}
