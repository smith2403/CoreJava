package q2;

public class Emp1 {
	private String name;
	private int id;
	private double sal;

	public Emp1(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 emp1 = new Emp1("Smith", 1, 4590876);
		System.out.println(emp1);
	}

}
