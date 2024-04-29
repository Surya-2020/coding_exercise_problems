package com.geeks.problems;

public class KeyMap {
	

	private Class<?> resultClass;
	private String age;

	
	
	public KeyMap(Class<?> resultClass,String age) {
		super();
		this.age = age;
		this.resultClass = resultClass;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public Class<?> getResultClass() {
		return resultClass;
	}



	public void setResultClass(Class<?> resultClass) {
		this.resultClass = resultClass;
	}



	public KeyMap() {
		super();
	}
	
	
	
	

}
