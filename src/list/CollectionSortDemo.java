package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collection类下有一个Static方法
 * sort(List<T> List)方法
 * @author Nick
 *
 */
public class CollectionSortDemo {
	public static void main(String[] args) {
		/**
		 * sort()排序方法
		 * 1.sort()
		 * 调用Collections的sort方法
		 */
		List<Integer> list = new ArrayList<Integer>();
		Collection collec = new ArrayList();
		list.add(2);
		list.add(0);
		list.add(-1);
		list.add(100);
	    Collections.sort(list);
	    System.out.println(list);
	    /**
	     * 接口：comparable
	     * Student类调用Collections.sort()方法
	     * 必须重写类中的compareTo()方法
	     * 重写完成以后才能调用sort()方法
	     * 内比较器
	     */
	    List<Student> stuList = new ArrayList<Student>();
	    Student stu1 = new Student("jony",90,"men");
	    Student stu2 = new Student("nick",26,"women");
	    Student stu3 = new Student("rose",29,"men");
	    stuList.add(stu1);
	    stuList.add(stu2);
	    stuList.add(stu3);
	    System.out.println(stuList);
	  /*  Collections.sort(stuList);*/
	    System.out.println(stuList);
	    /**
	     * 希望集合中的学生对象以名字排序，不改变类中comoareTo()方法
	     * 运用外比较器
	     * Collections.sort(List,c)//c为comparator类
	     */
	    CollectionSortDemo csd = new CollectionSortDemo();
	    
	    Collections.sort(stuList,csd.new ByAge());
	    System.out.println(stuList);
	}
	/**
	 * 接口:comparetor
	 * Comparator():外比较器
	 * 写一个自定义比较器类，只不过这个比较器类在Student封装类的外部
	 * 重写compare(t 1,t 2)两个方法
	 * @author Nick
	 *
	 */
	private class ByAge implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getAge()-o2.getAge();
		}

	}

}

