package interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Reptitive_Program {
  
	public static void main(String[] args) {
		
		String str = "this ur this ur that this";
		String[] split = str.split(" ");
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		for (String key : split) {
			if(m.containsKey(key)) {
			Integer i = m.get(key);
			m.put(key, i+1);
			}
			else {
				m.put(key, 1);
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
