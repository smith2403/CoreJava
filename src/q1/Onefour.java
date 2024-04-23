package q1;

public class Onefour {

	private String name;
	private int age;
	private int sal;

	public Onefour(String name, int age, int sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Onefour [name= " + name + ", age= " + age + ", salary= " + sal + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onefour onefour = new Onefour("Smith", 24, 50000);
		System.out.println(onefour);
	}

}
