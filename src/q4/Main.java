package q4;

public class Main {

	public static void main(String[] args) {

		try {
			int a = 2 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Always Executed");
		}

	}

}
