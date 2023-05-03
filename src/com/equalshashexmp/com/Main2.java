package com.equalshashexmp.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<Integer> myList = Arrays.asList(1,4,7,22,5,6,9,10,18);
		 * System.out.println(myList.stream().sorted(Comparator.reverseOrder()).limit(2)
		 * .skip(1).findFirst().get());
		 */
		/*Map<String, Integer> myMap = new HashMap<String, Integer>();
		List<String> words = new ArrayList<String>();
		words.add("sambit");
		words.add("sambit");
		//words.add("sambit");
		//words.add("sambit");
		words.add("pratik");
		words.add("pratik");
		words.add("winnie");
		//words.add("sambit");
		//words.add("sambit");
		for (String s : words) {
			if(myMap.isEmpty()) {
				myMap.put(s, 1);
			} else {
			if (myMap.containsKey(s)) {
				Integer count = myMap.get(s);
				int newcount = count+1;
				myMap.put(s, newcount);
			} else {
				myMap.put(s, 1);
			}
			}
		}
		System.out.println(myMap);
		Map<String, Integer> sortMap = myMap.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortMap);*/
		
		
		
		
	}

}
