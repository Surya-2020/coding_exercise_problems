package com.geeks.problems;

public class Student {
	
	private Integer age;
	private String name;
	private String classname;
	public Student(Integer age, String name, String classname) {
		super();
		this.age = age;
		this.name = name;
		this.classname = classname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	

}
