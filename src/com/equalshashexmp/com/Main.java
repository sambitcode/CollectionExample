package com.equalshashexmp.com;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("1", "sambit", 29);
		Student s2 = new Student("2", "sankha", 27);
		Student s3 = new Student("3", "pallu", 28);
		Student s4 = new Student("4", "xyz", 35);
		
		Map<Student, String> studentlaptopMap = new HashMap<>();
		
		studentlaptopMap.put(s1, "Dell");
		studentlaptopMap.put(s2, "Hp");
		studentlaptopMap.put(s3, "Lenevo");
		studentlaptopMap.put(s4, "Asus");
		
		studentlaptopMap.forEach((k, v) -> System.out.println(k + " " + v));
		
		//without hascode and equals override it is an issue.because two sankha object is different and fails in hashcode and then equals method check
		System.out.println(studentlaptopMap.get(new Student("2", "sankha", 27)));
		
	}
	//What will the following print - 

	

}
