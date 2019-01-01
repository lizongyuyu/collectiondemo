package collection;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 必须是引用类
 * @author Nick
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection col = new ArrayList();
		//向集合中添加元素
		/**
		 * add()
		 */
		boolean f1 = col.add("java");
		boolean f2 = col.add("php");
		boolean f3 = col.add("python");
		System.out.println(col+" "+f1+" "+f2);
		/**
		 * contains(Object) - boolean
		 * 判断指定元素是否存在于集合中
		 * 判断方式：调用集合中的equals()方法进行比较，注意重写和为重写的区别（地址和值判断）
		 */
		String str = "java";
		boolean f4 = col.contains(str);
		System.out.println(f4);
		
		/**
		 * size()
		 * 集合中的元素
		 */
		int a = col.size();
		System.out.println(a);//数组中为.length,String中.length(),集合中为size()
		/**
		 * clear()
		 * 清空集合中的元素
		 */
		/*col.clear();*/
		/**
		 * isEmply() -boolean
		 */
		boolean x = col.isEmpty();
		System.out.println(x);
		/**
		 * addAll(Collection) -boolean
		 * 将集合中的全部元素添加到另外一个集合中
		 * 
		 */
		Collection col1 = new ArrayList();
		col1.addAll(col);
		col1.add("sf");
		col1.add("sg");
		System.out.println(col1);//[sf, sg, java, php, python]
		/**
		 * containsAll(Collection) - boolean
		 * 判断是否存在给定的集合,所有元素
		 */
		boolean b = col1.containsAll(col);
		System.out.println(col1+" "+col);
		System.out.println(b);
		
		/**
		 * 关于泛型机制
		 * 对集合中元素进行限定，规范人的操作
		 * <数据类型>
		 * 必须是引用类型
		 * 不能使基本类型
		 * 泛型机制只存在于编译器，运行期不存在
		 */
		Collection <String> collection = new <String>  ArrayList();
		
	}

}
