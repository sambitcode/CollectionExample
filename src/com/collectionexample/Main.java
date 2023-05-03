package com.collectionexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee("1", "sambit","sarkar","kalo", 29),
				new Employee("2", "sankha", "basu","nata", 27),
				new Employee("3", "pallu", "Singh","hanthi",28),
				new Employee("4", "axyz", "","",35)
				);
		
		Collections.sort(empList);
		
		//System.out.println(empList);
		
		EmpCompByName empCompByName = new EmpCompByName();
		
		//Collections.sort(empList, empCompByName);
		
		//System.out.println(empList);
		
		//Map<Employee,String> myTreeMap = new TreeMap<Employee,String>();
		//myTreeMap.put(new Employee("1", "sambit", 29), "sambit");
		//myTreeMap.put(new Employee("2", "sankha", 27), "sankha");
		//myTreeMap.put(new Employee("3", "pallu", 28), "pallu");
		
		//Map<Employee,String> myTreeMap2 = new TreeMap<Employee,String>(empCompByName);
		//myTreeMap2.put(new Employee("1", "sambit", 29), "sambit");
		//myTreeMap2.put(new Employee("2", "sankha", 27), "sankha");
		//myTreeMap2.put(new Employee("3", "pallu", 28), "pallu");
		
		//myTreeMap.forEach((k,v)->System.out.println(k +" "+v));
		//myTreeMap2.forEach((k,v)->System.out.println(k +" "+v));
		
		/** java 8 comparator*/
		//using lamda
		Comparator<Employee> lastNameComparator = (e1,e2) -> e1.getLastName().compareTo(e2.getLastName());
		//Collections.sort(empList, lastNameComparator);
		
		//using method ref 
		Comparator<Employee> lastNameComparator2 = Comparator.comparing(Employee::getLastName);
		//Collections.sort(empList, lastNameComparator2);
		
		//chainingComparator
		Comparator<Employee> firstThenlastNameComparator = Comparator.comparing(Employee::getName).thenComparing(Employee::getLastName);
		//Collections.sort(empList, firstThenlastNameComparator);
		
		//stream
		List<Employee> sortedByStream = empList.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).collect(Collectors.toList());
		List<Employee> sortedByStreamChanin = empList.stream().sorted((e1,e2)->e1.getLastName().compareTo(e2.getLastName())).sorted((e1,e2)->e1.getAge()-e2.getAge()).collect(Collectors.toList());
		sortedByStream.forEach(e1 -> System.out.println(e1));
		//sortedByStreamChanin.forEach(e1 -> System.out.println(e1));
	}

}
