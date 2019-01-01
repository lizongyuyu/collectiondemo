package map;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {
	public static void main(String[] args) {
		Student stu1 = new Student(1,"nick");
		Student stu2 = new Student(2,"merry");
		Student stu3 = new Student(3,"hyacin");
		Map<Integer, Student> map = new HashMap<Integer,Student>();
		map.put(stu1.getStudentid(), stu1);
		map.put(stu2.getStudentid(), stu2);
		map.put(stu2.getStudentid(), stu2);
		//²éÕÒ¼üÖµ
		Student stu4 = map.get(1);
		System.out.println(stu4);
	}

}
