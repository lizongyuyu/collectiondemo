package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * deque��queue���ӽӿ�
 * ����˫�˽ӿ�
 * �ص㣺���Դ����˷ֱ���Ӻͳ���
 * 
 * @author Nick
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		/**
		 * ���Ԫ��
		 */
		deque.offer("java");
		deque.offer("c++");
		System.out.println(deque);
		//�ڶ��ײ���Ԫ��
		deque.offerFirst("hi");
		System.out.println(deque);
		//�ڶ�β����Ԫ��
		deque.offerLast("end");
		System.out.println(deque);
		/**
		 * ����poll��peek
		 */
		//��ȡ���Ƴ���һ��Ԫ��
		String str = deque.pollFirst();
		System.out.println(deque);
		//��ȡ���Ƴ����һ��Ԫ��
		String str1 = deque.pollLast();
		System.out.println(deque);
		//��ȡ��ɾ����һ��Ԫ��
		String str3 = deque.peekFirst();
		System.out.println(str3);
		//��ȡ��ɾ�����һ��Ԫ��
		String str4 = deque.peekLast();
		System.out.println(str4);
		
	}

}
