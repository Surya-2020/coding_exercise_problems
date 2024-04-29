package com.parctice.problem.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		Employee emp = new Employee("Surya", 25, "Male", "IT");
		Employee emp2 = new Employee("Sathiesh", 30, "Male", "HR");
		Employee emp3 = new Employee("Suresh", 28, "Male", "IT");
		Employee emp4 = new Employee("Mathu", 23, "Female", "HR");
		Employee emp5 = new Employee("Renu", 24, "Female", "IT");

		List<Employee> list = new ArrayList<>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp5);
		list.add(emp4);

		list.stream().map(m -> m.getDepartment()).distinct().forEach(System.out::println);
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);
		Map<String, Double> age = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(age);
       Map<String,List<String>> maplist= list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
 List<String> kk=new ArrayList<>();
 Map<String, Optional<Employee>> maplist2= list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getAge)))));
 System.out.println(maplist2);
 
       System.out.println(maplist);
	    
	}
}
