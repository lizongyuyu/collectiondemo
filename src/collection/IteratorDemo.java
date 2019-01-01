package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器是一个接口，集合实现类在重写Collection的iterator()
 * 方法是利用内部类提供的迭代器的实现
 * @author Nick
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		String str;
		Collection<String> collection = new  ArrayList<String>();
		collection.add("a");
		collection.add("b");
		collection.add("c");
		collection.add("a");
		collection.add("b");
		collection.add("c");
		Iterator <String> it = collection.iterator();
		/*String str = it.next();
		System.out.println(str);*/
		/**
		 * 对集合进行遍历-用迭代器
		 * while 循环
		 * hasNext() 下一个是否存在
		 * next() 取值
		 */
		/*while(it.hasNext()) {
			str = it.next();
			System.out.println(str);
		}*/
		/**
		 *对集合进行遍历，如果遍历到的字母包含a
		 *将次元素从集合中移除
		 *用迭代器遍历集合元素工程中要删除元素
		 *只能用迭代器的remove，不可以使用集合的remove
		 */
		while(it.hasNext()) {
			str = it.next();
			int index = str.indexOf('a');
			if(index!=-1) {
				it.remove();
			}	
		}
		System.out.println(collection);
		/**
		 * forEach循环:增强for循环
		 * 写法：for(数据类型 变量：Collection){
		 * 具体操作
		 */
		for(String s:collection) {
			System.out.println(s);
		}
	}

}
