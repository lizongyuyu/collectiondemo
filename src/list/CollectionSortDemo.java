package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collection������һ��Static����
 * sort(List<T> List)����
 * @author Nick
 *
 */
public class CollectionSortDemo {
	public static void main(String[] args) {
		/**
		 * sort()���򷽷�
		 * 1.sort()
		 * ����Collections��sort����
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
	     * �ӿڣ�comparable
	     * Student�����Collections.sort()����
	     * ������д���е�compareTo()����
	     * ��д����Ժ���ܵ���sort()����
	     * �ڱȽ���
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
	     * ϣ�������е�ѧ���������������򣬲��ı�����comoareTo()����
	     * ������Ƚ���
	     * Collections.sort(List,c)//cΪcomparator��
	     */
	    CollectionSortDemo csd = new CollectionSortDemo();
	    
	    Collections.sort(stuList,csd.new ByAge());
	    System.out.println(stuList);
	}
	/**
	 * �ӿ�:comparetor
	 * Comparator():��Ƚ���
	 * дһ���Զ���Ƚ����ֻ࣬��������Ƚ�������Student��װ����ⲿ
	 * ��дcompare(t 1,t 2)��������
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

