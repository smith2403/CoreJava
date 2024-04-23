package q4;

class MyExcept extends Exception {
	public MyExcept(String s) {
		super(s);
	}
}

public class Main3 {

	public static void main(String[] args) {
		try {
			throw new MyExcept("User Defined Exception");
		} catch (Exception e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());

		}
	}
}
