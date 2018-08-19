package tw.org.iii.mytest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Alex74 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "Alex");
		map.put("stage", 2);
		map.put("sound", false);
		System.out.println(map);
		System.out.println(map.get("name"));
		System.out.println("-----");
		Set<String> keys = map.keySet();
		for (String key: keys) {
			System.out.println(map.get(key));
		}
		System.out.println("-----");
		Collection<Object> vs = map.values();
		for (Object obj : vs) {
			System.out.println(obj);
		}
		

	}

}
