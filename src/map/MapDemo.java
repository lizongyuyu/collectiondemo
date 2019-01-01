package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合保存的一组键值对（具有映射关系的）
 * key与value必须是引用类型
 * @author Nick
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		/**
		 * 像集合中添加元素-put(k,v)
		 * put(k,v)-V将次key原来对应的value返回
		 * 如果此key不存在返回null
		 * 如果存放的key存在，则会覆盖之前的value
		 */
		Map<String, Integer> map = new HashMap<String,Integer>();
		/**
		 * 存放值
		 */
		map.put("语文",90);
		map.put("数学",90);
		map.put("英语",90);
		/**
		 * 获取值
		 */
		Integer i = map.get("数学");
		Integer m = map.get("");
		System.out.println(i+" "+m);
		/**
		 * 判断键值是否存在
		 * contaionsKey()
		 */
		boolean flag = map.containsKey("数学");//调用的其实是equals()方法
		System.out.println(flag);
		
	}

}
