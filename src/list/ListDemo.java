package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 调用的get()set()等方法，是父类List中的方法
 * 而不是爷类Collection中的方法
 * @author Nick
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("web");
		list.add(".net");
		list.add("ios");
		/**
		 * get()方法
		 */
		String str = list.get(2);
		System.out.println(str);
		/**
		 * set()方法
		 */
		String old = list.set(0, "js");
		System.out.println(old);
		/**
		 * add()方法
		 */
		list.add(3,"php");
		System.out.println(list);
		/**
		 * remove()方法
		 */
		list.remove(0);
		System.out.println(list);
		/**
		 * List转换为toArray
		 * 1.toArray() list-Object[]
		 */
		Object[] list1 = list.toArray();
		System.out.println(Arrays.toString(list1));//toString()方法并未重写
		/**
		 * 2.toArray(T[])
		 */
		String[] list2 = list.toArray(new String[] {});
		System.out.println(Arrays.toString(list2));
		/**
		 * 数组转集合
		 * 可以进行修改，修改对数组本身用影响
		 * 但是不能进行增删
		 * 静态方法
		 */
		String[] str1 = {"java","php","sam","hover"};
		List<String> list3 = Arrays.asList(str1);
		System.out.println(list3);
	}

}
