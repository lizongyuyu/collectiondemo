package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue��������һ�����ݽṹ���ص����Ƚ��ȳ�
 * ֻ�ܴ�һ�����Ԫ�أ�����һ��ȡ��Ԫ��
 * @author Nick
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		/**
		 * offer()
		 * poll()��ȡ��һ����ɾ��
		 * peak()��ȡ��һ����ɾ��
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
		 * ���б���
		 * 1.foreach(){}
		 * 2.���б���
		 */
		for(String s:queue) {
			System.out.println(s);
		}
		while(queue.size()>0) {
			System.out.println(queue.poll());
		}
		
	}

}
