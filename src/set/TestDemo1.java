package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ���ܿ���̨���������
 * �������ݷ�װ������
 * @author Nick
 *
 */
public class TestDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("������ѧ�ź�����");
			int id = scan.nextInt();
			String name = scan.next();//nextline���Զ�ȡһ���ַ�����next��
			Set<Student> stu = new HashSet<Student>();
			Student stu1 = new Student(id,name);
			stu.add(stu1);
			System.out.println(stu);
		}//��ѭ����Ҫѡ���˳����˳�
		/*scan.close();*/
	}
	
}
