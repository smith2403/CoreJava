package q2;

public class Student {
	private String sname;
	private int sid;
	private double sfee;
	private String saddress;

	public Student(String sname, int sid, double sfee, String saddress) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sfee = sfee;
		this.saddress = saddress;
	}

	public String toString() {
		return "Student[ name= " + sname + ", sid= " + sid + ", sfee= " + sfee + ", saddress= " + saddress + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("SMith", 12, 45, "Mumbai");
		System.out.println(student);
	}

}
