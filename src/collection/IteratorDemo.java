package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������һ���ӿڣ�����ʵ��������дCollection��iterator()
 * �����������ڲ����ṩ�ĵ�������ʵ��
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
		 * �Լ��Ͻ��б���-�õ�����
		 * while ѭ��
		 * hasNext() ��һ���Ƿ����
		 * next() ȡֵ
		 */
		/*while(it.hasNext()) {
			str = it.next();
			System.out.println(str);
		}*/
		/**
		 *�Լ��Ͻ��б������������������ĸ����a
		 *����Ԫ�شӼ������Ƴ�
		 *�õ�������������Ԫ�ع�����Ҫɾ��Ԫ��
		 *ֻ���õ�������remove��������ʹ�ü��ϵ�remove
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
		 * forEachѭ��:��ǿforѭ��
		 * д����for(�������� ������Collection){
		 * �������
		 */
		for(String s:collection) {
			System.out.println(s);
		}
	}

}
