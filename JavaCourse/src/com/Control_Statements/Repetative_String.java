package com.Control_Statements;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_String {
 
	public static void main(String[] args) {
		
		String s = "think before you speak read before you think";
		
		String[] split = s.split(" ");
		
		
		
		Map<String, Integer> m = new LinkedHashMap<>();
		
		for (String string : split) {
			
			if(m.containsKey(string)) {
				
				Integer i = m.get(string);
				
				m.put(string, i+1);
			}
			else {
				m.put(string, 1);
			}
			
		} System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
			
		}
	}

