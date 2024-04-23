package q2;

public class Emp {
	private String name;
	private int id;
	private double sal;
	private String address;

	public Emp(String name, int id, double sal, String address) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name " + name);
		System.out.println("ID " + id);
		System.out.println("Salary " + sal);
		System.out.println("Address " + address);
	}

	public static void main(String[] args) {
		Emp emp = new Emp("Smith", 20, 25000, "Mumbai");
		emp.displayInfo();

	}

}
