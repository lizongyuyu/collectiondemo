package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set集合是不可重复集
 * @author Nick
 *
 */
public class HashSetDemo {
	public static void main(String[] args) {
		/**
		 *HashSet是无序的
		 */
		Set<Student> stuSet = new HashSet<Student>();
		Student stu = new Student(1,"nick");
		Student stu1 = new Student(2,"rose");
		Student stu2 = new Student(3,"merry");
		stuSet.add(stu);
		stuSet.add(stu1);
		stuSet.add(stu2);
		/**
		 * 对set进行遍历
		 * 1.foreach
		 * 2.Iteratro迭代器
		 */
		for(Student s:stuSet) {
			System.out.println(s.toString());
		}
		System.out.println();
		Iterator<Student> it = stuSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
