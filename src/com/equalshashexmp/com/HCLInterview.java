package com.equalshashexmp.com;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HCLInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HcL core java technical interview";
		String s1 = s.replaceAll(" ", "");
		char[] mycharArr = s1.toCharArray();
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();

		for (int i = 0; i < mycharArr.length; i++) {
			if (myMap.isEmpty()) {
				myMap.put(mycharArr[i], 1);
			} else {
				if (myMap.containsKey(mycharArr[i])) {
					int count = myMap.get(mycharArr[i]);
					count = count + 1;
					myMap.put(mycharArr[i], count);
				} else {
					myMap.put(mycharArr[i], 1);
				}
			}
		}
		Map<Character, Integer> mySortedMap = myMap.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByValue()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(mySortedMap);
		
		
		Map.Entry<Character, Integer> entry = mySortedMap.entrySet().iterator().next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		
		/*
		 * String s ="sam";
		 * 
		 * for(int i =0;i<s.length();i++) { char ch = s.charAt(i); }
		 */
		
		
		
	}
	
	public void myPermutation(String s) {
		
	}

}
