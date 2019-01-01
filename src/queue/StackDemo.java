package queue;

import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * �����deque�������ƣ�ֻ������һ�˽�����Ӻͳ��Ӳ��������γ���ջstack���ݽӿ�
 * �ص㣺�Ƚ����
 * ��ջ��push(E)��Ԫ��ѹ��ջ��
 * ��ջ��pop()��ջ��Ԫ��ȡ������ɾ��
 * 
 */
public class StackDemo {
	public static void main(String[] args) {
		//����һ����������
		Deque<String> stack = new LinkedList<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		System.out.println(stack);
		String str = stack.pop();
		System.out.println(str);
		/*
		 * [d, c, b, a]
            d
		 */
	}

}
