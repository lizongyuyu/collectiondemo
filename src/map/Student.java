package map;

public class Student {
	protected int studentid;
	protected String name;
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + "]";
	}
	public Student(int studentid, String name) {
		super();
		this.studentid = studentid;
		this.name = name;
	}
	public Student() {
		super();
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + studentid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studentid != other.studentid)
			return false;
		return true;
	}

}
