package q1;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public float add(float a, float b, float c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println("2args " + c.add(5, 5));

		System.out.println("3args " + c.add(5, 5, 5));
		
		System.out.println("Float" + c.add(5, 5, 5));
		
		System.out.println("Double " + c.add(5, 5));

	}

}
