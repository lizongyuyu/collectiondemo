package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * map�ı���
 * HashMap�ǲ�ѯ������ߵ�
 * @author Nick
 *
 */
public class KeysetDemo {
	public static void main(String[] args) {
		/**
		 * 1.keySet()����
		 * �õ�һ��keyֵ��set����
		 */
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����",90);
		map.put("��ѧ",95);
		map.put("Ӣ��",80);
		Set<String> setMap = map.keySet();
		for(String s:setMap) {
			System.out.println(s);
		}
		/**
		 *2. entrySet()
		 * �õ�map�����е����м�ֵ��
		 */
		Set<Entry<String,Integer>> set =  map.entrySet();//Entry<k,v>�����ֵ��
		for(Entry<String,Integer> s:set) {
			System.out.println(s.getKey()+"-"+s.getValue());
		}
	}

}
