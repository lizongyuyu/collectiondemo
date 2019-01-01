package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * deque是queue的子接口
 * 叫做双端接口
 * 特点：可以从两端分别入队和出兑
 * 
 * @author Nick
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		/**
		 * 添加元素
		 */
		deque.offer("java");
		deque.offer("c++");
		System.out.println(deque);
		//在队首插入元素
		deque.offerFirst("hi");
		System.out.println(deque);
		//在队尾插入元素
		deque.offerLast("end");
		System.out.println(deque);
		/**
		 * 出队poll和peek
		 */
		//获取并移除第一个元素
		String str = deque.pollFirst();
		System.out.println(deque);
		//获取并移除最后一个元素
		String str1 = deque.pollLast();
		System.out.println(deque);
		//获取不删除第一个元素
		String str3 = deque.peekFirst();
		System.out.println(str3);
		//获取不删除最后一个元素
		String str4 = deque.peekLast();
		System.out.println(str4);
		
	}

}
