package q3;

import java.util.Objects;

public class Main implements Cloneable {
	private String name;
	private int id;

	public Main(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("Garbage Collected");
	}

	@Override
	public String toString() {
		return "Name= " + name + ", id= " + id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Main other = (Main) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Main main = new Main("Smith", 24);
		System.out.println(main);

		Main main2 = (Main) main.clone();

		System.out.println(main.equals(main2));

		System.out.println(main.hashCode());

		main = null;
		System.gc();

	}

}
