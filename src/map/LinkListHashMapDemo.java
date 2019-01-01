package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * LinkedHashMap:�����Map
 * �ײ�ά����һ��˫��ѭ��������¼�˵���˳�򣬼����˳��
 * @author Nick
 *
 */
public class LinkListHashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����",90);
		map.put("��ѧ",95);
		map.put("Ӣ��",80);
		Set<String> setMap = map.keySet();
		for(String s:setMap) {
			System.out.println(s);
		}
		
		Map<String,Integer> map2 = new LinkedHashMap<String,Integer>();
		map2.put("����",90);
		map2.put("��ѧ",90);
		map2.put("Ӣ��",90);
		Set<String> setMap2 = map2.keySet();
		for(String s:setMap2) {
			System.out.println(s);
		}
	}

}
