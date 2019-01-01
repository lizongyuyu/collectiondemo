package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * ���õ�get()set()�ȷ������Ǹ���List�еķ���
 * ������ү��Collection�еķ���
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
		 * get()����
		 */
		String str = list.get(2);
		System.out.println(str);
		/**
		 * set()����
		 */
		String old = list.set(0, "js");
		System.out.println(old);
		/**
		 * add()����
		 */
		list.add(3,"php");
		System.out.println(list);
		/**
		 * remove()����
		 */
		list.remove(0);
		System.out.println(list);
		/**
		 * Listת��ΪtoArray
		 * 1.toArray() list-Object[]
		 */
		Object[] list1 = list.toArray();
		System.out.println(Arrays.toString(list1));//toString()������δ��д
		/**
		 * 2.toArray(T[])
		 */
		String[] list2 = list.toArray(new String[] {});
		System.out.println(Arrays.toString(list2));
		/**
		 * ����ת����
		 * ���Խ����޸ģ��޸Ķ����鱾����Ӱ��
		 * ���ǲ��ܽ�����ɾ
		 * ��̬����
		 */
		String[] str1 = {"java","php","sam","hover"};
		List<String> list3 = Arrays.asList(str1);
		System.out.println(list3);
	}

}
