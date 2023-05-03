package com.collectionexample;

import java.util.*;

public class MainString {

	public static void main(String[] args) {
		tryCatch();
		
		List<String> abc = new ArrayList<>();
		changeList(abc);
		System.out.println(abc);
		
	}

	private static void changeList(List<String> abc) {
		abc.add("Sambit");
	}

	private static void tryCatch() {
		String s1= "hello";
		String s2= "hello";
		String s3 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}

}
