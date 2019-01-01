package queue;

import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * 如果对deque进行限制，只允许在一端进行入队和出队操作，就形成了栈stack数据接口
 * 特点：先进后出
 * 入栈：push(E)将元素压入栈低
 * 出栈：pop()将栈顶元素取出，并删除
 * 
 */
public class StackDemo {
	public static void main(String[] args) {
		//创建一个集合数据
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
