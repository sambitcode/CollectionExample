package com.collectionexample;

public class Employee implements Comparable<Employee>{
	
	private String id;
	private String name;
	private String lastName;	
	private String nickName;
	private int age;
		
	public Employee(String id, String name, String lastName, String nickName, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.setNickName(nickName);
		this.age = age;
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", nickName=" + nickName + ", age="
				+ age + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
		/*if (this.getAge() < o.getAge())
			return 1;
		else if (this.getAge() == o.getAge())
			return 0;
		else
			return -1;*/

	}

	
}
