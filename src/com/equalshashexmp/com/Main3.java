package com.equalshashexmp.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {

	/* static int i =1; */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8).skip(6).forEach(num -> System.out.println("\n" + num));

		/*
		 * System.out.println("The stream after applying "+"the function is : ");
		 * List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
		 * List answer =
		 * list.stream().map(String::toUpperCase).collect(Collectors.toList());
		 * System.out.println(answer);
		 */

		/*
		 * Supplier str = () -> "Saket"; System.out.println(str.get());
		 */

		/*
		 * int x= 20; System.out.println(x);
		 */

		/*
		 * try { System.out.println("1"); int sum = 9/0; System.out.println("2");
		 * }catch(ArithmeticException e) { System.out.println(3); }catch(Exception e) {
		 * System.out.println(4); }finally { System.out.println(5); }
		 */

		List<List<String>> names = Arrays.asList(Arrays.asList("Saket", "Trevor"), Arrays.asList("John,Micheal"),
				Arrays.asList("Shawn", "Franklin"), Arrays.asList("Jhonty", "Sean"));
		List<String> start = names.stream().flatMap(firstName -> firstName.stream()).filter(s -> s.startsWith("S"))
				.collect(Collectors.toList());
		start.forEach(System.out::println);

		/*
		 * FuncInterface total = (a,b) ->a*b;
		 * System.out.println("Results : "+total.multiply(30, 60));
		 */

		/*
		 * List list = new LinkedList<>(); list.add("Java"); list.add("for");
		 * list.add("Java"); list.add("developer"); Iterator itr = list.iterator();
		 * while(itr.hasNext()) { System.out.println(itr.next()+" "); }
		 * System.out.println();
		 */

		/*
		 * FuncInterface fobj = (int x)-> System.out.println(2*x); fobj.abstractFun(5);
		 */
		/* Helper help = new Helper(); */

		/*
		 * for(int i =1;i<10;i++) { i=i+2; System.out.println(i + " "); }
		 */

		/*
		 * Consumer str = str1 ->System.out.println(str1); str.accept("Saket");
		 */
	}

	/*
	 * static { int x=10; System.out.println(x+" "); }
	 */

}

/*
 * class Helper{ private int data; private Helper() { data =5; } }
 */

/*
 * interface FuncInterface{ void abstractFun(int x); default void normalFun() {
 * System.out.println("Hello"); } }
 */

/*
 * @FunctionalInterface interface FuncInterface{ public int multiply(int a, int
 * b); }
 */
