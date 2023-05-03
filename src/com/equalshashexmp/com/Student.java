package com.equalshashexmp.com;

import java.util.Objects;

public class Student implements Cloneable{
	
	private String id;
	private String name;
	private int age;
	private final String blankAge; 
		
	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		blankAge ="20";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(id)*2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student && this.getId() == ((Student) obj).getId())
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
