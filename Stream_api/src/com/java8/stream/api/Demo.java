package com.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>(Arrays.asList("Surya", "Abi", "Karthi", "Suresh", "Sathiesh"));
		Collections.sort(names);
		names.remove("Abi");
		System.out.println(names.toString());
		HashMap<String,String> map=new HashMap<>();
		map.put("12", "surya");
		map.put("13", "suresh");
		map.put("01", "hello");
		map.put(null, "jj");
		map.put(null, "zz");
		
		
		System.out.println(map.toString());
		// names.stream().limit(2).forEach(System.out::println);
		names.stream().forEach(t -> System.out.println(t.length()));
//		System.out.println(names.stream().anyMatch(i->i.equals("Surya")));
//		System.out.println(names.stream().allMatch(i->i.length()>0));

//		Stream.of('a', 'b', 'c', 'd', 'e')
//	    .map(c -> (int)c)
//	    .forEach(i -> System.out.format("%d ", i));

//		List<Character> aToD = Arrays.asList('a', 'b', 'c', 'd');
//		List<Character> eToG = Arrays.asList('e', 'f', 'g');
//		Stream<List<Character>> stream = Stream.of(aToD, eToG);
//		stream.flatMap(m->m.stream()).map(c -> (int)c).forEach(i -> System.out.format("%d ", i));

		List<Integer> streams = Arrays.asList(2, 34, 54, 23, 33, 20, 59, 11, 19, 37);
		/*s*/
		// System.out.println(map);
		double start = System.nanoTime();
		Stream.of("b", "d", "a", "c", "e").sorted().filter(s -> {
			System.out.println("Filter:" + s);
			return !"d".equals(s);
		}).parallel().map(s -> {
			System.out.println("Map:" + s);
			return s += s;
		}).forEach(System.out::println);
		double duration = (System.nanoTime() - start) / 1_000_000;
		System.out.println(duration);
	}

}
