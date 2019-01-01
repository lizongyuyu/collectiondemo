package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue：队列是一种数据结构，特点是先进先出
 * 只能从一段添加元素，从另一端取出元素
 * @author Nick
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		/**
		 * offer()
		 * poll()获取第一个并删除
		 * peak()获取第一个不删除
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		System.out.println(queue);
		String str = queue.poll();
		System.out.println(queue+" "+str);
		String str1 = queue.peek();
		System.out.println(queue+" "+str1);
		/**
		 * 队列遍历
		 * 1.foreach(){}
		 * 2.自行遍历
		 */
		for(String s:queue) {
			System.out.println(s);
		}
		while(queue.size()>0) {
			System.out.println(queue.poll());
		}
		
	}

}
