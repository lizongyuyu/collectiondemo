package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map���ϱ����һ���ֵ�ԣ�����ӳ���ϵ�ģ�
 * key��value��������������
 * @author Nick
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		/**
		 * �񼯺������Ԫ��-put(k,v)
		 * put(k,v)-V����keyԭ����Ӧ��value����
		 * �����key�����ڷ���null
		 * �����ŵ�key���ڣ���Ḳ��֮ǰ��value
		 */
		Map<String, Integer> map = new HashMap<String,Integer>();
		/**
		 * ���ֵ
		 */
		map.put("����",90);
		map.put("��ѧ",90);
		map.put("Ӣ��",90);
		/**
		 * ��ȡֵ
		 */
		Integer i = map.get("��ѧ");
		Integer m = map.get("");
		System.out.println(i+" "+m);
		/**
		 * �жϼ�ֵ�Ƿ����
		 * contaionsKey()
		 */
		boolean flag = map.containsKey("��ѧ");//���õ���ʵ��equals()����
		System.out.println(flag);
		
	}

}
