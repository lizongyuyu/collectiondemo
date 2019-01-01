package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 接受控制台输出的数据
 * 并将数据封装到类中
 * @author Nick
 *
 */
public class TestDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("请输入学号和姓名");
			int id = scan.nextInt();
			String name = scan.next();//nextline可以读取一切字符不如next好
			Set<Student> stu = new HashSet<Student>();
			Student stu1 = new Student(id,name);
			stu.add(stu1);
			System.out.println(stu);
		}//死循环需要选择退出不退出
		/*scan.close();*/
	}
	
}
