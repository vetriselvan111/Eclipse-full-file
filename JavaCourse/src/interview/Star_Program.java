package interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Star_Program {

public static void main(String[] args, Object key) {
		
		String str = "element";
		String[] split = str.split(" ");
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		for (String key1 : split) {
			if(m.containsKey(key1)) {
			Integer i = m.get(key1);
			m.put(key1, i+1);
			}
			else {
				m.put(key1, 1);
			}
		}
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>=1) {
				System.out.println(entry);
				
			}
		}
	}
}

