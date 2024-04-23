package q4;
//exception propagation
public class Main2 {

	void a() {
		int a = 2 / 0;
	}

	void b() {
		a();
	}

	void c() {
		try {
			b();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Main2 main2 = new Main2();
		main2.c();
		System.out.println("Normal Flow");

	}

}
