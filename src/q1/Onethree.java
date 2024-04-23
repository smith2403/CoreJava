package q1;

public class Onethree {
	public int num = 24;
	public static int age = 20;

	public void localVar() {
		int month = 11;
		System.out.println("Local Var" + month);
	}

	public static void main(String[] args) {

		Onethree ob = new Onethree();
		System.out.println("Global Var" + ob.num);
		System.out.println("Static Var" + ob.age);

		ob.localVar();

	}

}
