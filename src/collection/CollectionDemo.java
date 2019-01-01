package collection;

import java.util.ArrayList;
import java.util.Collection;
/**
 * ������������
 * @author Nick
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection col = new ArrayList();
		//�򼯺������Ԫ��
		/**
		 * add()
		 */
		boolean f1 = col.add("java");
		boolean f2 = col.add("php");
		boolean f3 = col.add("python");
		System.out.println(col+" "+f1+" "+f2);
		/**
		 * contains(Object) - boolean
		 * �ж�ָ��Ԫ���Ƿ�����ڼ�����
		 * �жϷ�ʽ�����ü����е�equals()�������бȽϣ�ע����д��Ϊ��д�����𣨵�ַ��ֵ�жϣ�
		 */
		String str = "java";
		boolean f4 = col.contains(str);
		System.out.println(f4);
		
		/**
		 * size()
		 * �����е�Ԫ��
		 */
		int a = col.size();
		System.out.println(a);//������Ϊ.length,String��.length(),������Ϊsize()
		/**
		 * clear()
		 * ��ռ����е�Ԫ��
		 */
		/*col.clear();*/
		/**
		 * isEmply() -boolean
		 */
		boolean x = col.isEmpty();
		System.out.println(x);
		/**
		 * addAll(Collection) -boolean
		 * �������е�ȫ��Ԫ����ӵ�����һ��������
		 * 
		 */
		Collection col1 = new ArrayList();
		col1.addAll(col);
		col1.add("sf");
		col1.add("sg");
		System.out.println(col1);//[sf, sg, java, php, python]
		/**
		 * containsAll(Collection) - boolean
		 * �ж��Ƿ���ڸ����ļ���,����Ԫ��
		 */
		boolean b = col1.containsAll(col);
		System.out.println(col1+" "+col);
		System.out.println(b);
		
		/**
		 * ���ڷ��ͻ���
		 * �Լ�����Ԫ�ؽ����޶����淶�˵Ĳ���
		 * <��������>
		 * ��������������
		 * ����ʹ��������
		 * ���ͻ���ֻ�����ڱ������������ڲ�����
		 */
		Collection <String> collection = new <String>  ArrayList();
		
	}

}
