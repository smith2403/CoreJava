package q4;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[5];
			a[5] = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println("task 1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2");
		} catch (Exception e) {
			System.out.println("task 3");
		}
	}

}
//MultiCATCH exception