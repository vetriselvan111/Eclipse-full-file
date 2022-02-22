package com.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Methods {
    public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "java");
		m.put(2, "c");
		m.put(3, "c++");
		m.put(4, "Python");
		m.put(5, "Class");
		m.put(null, "Greens");
		m.put(null,"Technologies");
		m.put(7, null);
		m.put(8, null);
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		Object string = m.get(null);
		System.out.println(string);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
	
		Collection<String> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey(10);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(null);
		System.out.println(containsValue);
		
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		 
		for (Entry<Integer, String> entry : entrySet) {
			 System.out.println(entry);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
