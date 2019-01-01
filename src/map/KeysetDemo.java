package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * map的遍历
 * HashMap是查询性能最高的
 * @author Nick
 *
 */
public class KeysetDemo {
	public static void main(String[] args) {
		/**
		 * 1.keySet()方法
		 * 得到一个key值得set集合
		 */
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文",90);
		map.put("数学",95);
		map.put("英语",80);
		Set<String> setMap = map.keySet();
		for(String s:setMap) {
			System.out.println(s);
		}
		/**
		 *2. entrySet()
		 * 得到map集合中的所有键值对
		 */
		Set<Entry<String,Integer>> set =  map.entrySet();//Entry<k,v>代表键值对
		for(Entry<String,Integer> s:set) {
			System.out.println(s.getKey()+"-"+s.getValue());
		}
	}

}
