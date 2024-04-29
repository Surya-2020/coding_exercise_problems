package com.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import com.parctice.problem.streams.Employee;

public class FinalVar {

	private List<Employee> list = new ArrayList<>();
	private ConcurrentMap<String, List<Employee>> map = null;

	public void m1() {

		Employee emp = new Employee("Surya", 25, "Male", "IT");
		Employee emp2 = new Employee("Sathiesh", 30, "Male", "HR");
		Employee emp3 = new Employee("Suresh", 28, "Male", "IT");
		Employee emp4 = new Employee("Mathu", 23, "Female", "HR");
		Employee emp5 = new Employee("Renu", 24, "Female", "IT");
		list.add(emp5);
		list.add(emp4);
		list.add(emp3);
		list.add(emp2);
		list.add(emp);
     String s="MHBAN00187340000489553";
     System.out.println(s.length());
		map = list.stream().collect(Collectors.groupingByConcurrent(Employee::getGender));
		System.out.println(map);

	}

}
