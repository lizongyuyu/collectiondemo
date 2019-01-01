package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * LinkedHashMap:有序的Map
 * 底层维护着一个双向循环链表，记录了迭代顺序，即存放顺序
 * @author Nick
 *
 */
public class LinkListHashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文",90);
		map.put("数学",95);
		map.put("英语",80);
		Set<String> setMap = map.keySet();
		for(String s:setMap) {
			System.out.println(s);
		}
		
		Map<String,Integer> map2 = new LinkedHashMap<String,Integer>();
		map2.put("语文",90);
		map2.put("数学",90);
		map2.put("英语",90);
		Set<String> setMap2 = map2.keySet();
		for(String s:setMap2) {
			System.out.println(s);
		}
	}

}
