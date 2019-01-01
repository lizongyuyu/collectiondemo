package set;

public class Student {
	protected int studentID;
	protected String name;
	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}
	public Student() {
		super();
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
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
		result = prime * result + studentID;
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
		if (studentID != other.studentID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "studentID=" + studentID + ", name=" + name ;
	}
	

}
