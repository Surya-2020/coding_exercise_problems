package com.geeks.problems;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AlternatePosNegNo {

	public static void main(String[] args) {
		
		List<Person> person =new ArrayList<>();
		List<Person> person2 =Collections.emptyList();

		List<Object> objlt=Collections.emptyList();
		List<Object> obj2=Collections.emptyList();
		
		person.add(new Person("13","surya","123 st."));
		person.add(new Person("14", "satish", "234 st."));
		
		Object obj=person;
		
		boolean flag=obj instanceof List;
		List<?> list= (List<?>) obj;
		if(list.get(0) instanceof Person) {
			person2= (List<Person>) list;
		}
		
		
		Integer a[] = { -8, -7, -5, -3, -1, -4, -2, -5 };
		Integer b[] = new Integer[8];
		Integer c[] = new Integer[0];
		Integer out[] = new Integer[8];
		int j = 0, z = 0, v = 0, h = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				b[j] = a[i];// {-8,-7,-3,-2}
				// System.out.println(b[j]);
				j++;
			} else {
				c[z] = a[i];// {5,1,4}
				z++;
			}
		}
		System.out.println(c.length - 1);

		for (int f = 0; f < b.length + c.length; f++) {

			if ((f % 2 == 1 && v <= b.length - 1) || c.length == 0) {
				out[f] = b[v];
				v++;
			} else if (h <= c.length - 1) {
				out[f] = c[h];
				h++;
			}
		}
		for (int g = 0; g < out.length; g++) {
			System.out.print(" " + out[g]);
		}
		System.out.println();
		mergeAlternateString();
		exception();
		splitmethod();
		shiftClockwise(a);
		OccurenceOfString();
		System.out.println();
		removeOccurenceOfStr();
		sortString();
		System.out.println();
		printLongestPalindromeWord();
		System.out.println("Anagram");
		System.out.println(anagram());
		printAllAnagram();
		printPalindromeInSentence();
		System.out.println();
		bubbleSort();
	}

	private static void sortString() {
		String str="nagjsrthskl";
		final int MAX_CHAR = 26;

		// function to print string in sorted order

		// Hash array to keep count of characters.
		int letters[] = new int[MAX_CHAR];

		// Traverse string and increment
		// count of characters
		for (char x : str.toCharArray()) {

			// 'a'-'a' will be 0, 'b'-'a' will be 1,
			// so for location of character in count
			// array we will do str[i]-'a'.
			letters[x - 'a']++;
		}

		// Traverse the hash array and print
		// characters
		for (int i = 0; i < MAX_CHAR; i++) {
			for (int j = 0; j < letters[i]; j++) {
				System.out.print((char) (i + 'a'));
			}
		}

	}

	private static void splitmethod() {
		
		List<Person> person =new ArrayList<>();
		Person person1=new Person("13","surya","123 st.");
		System.out.println(person1);
		Person person2=new Person("13","surya","123 st.");
		System.out.println(person2);
		person.add(new Person("13","surya","123 st."));
		person.add(new Person("13", "satish", "234 st."));
		person.add(new Person("14", "aryan", "007 st."));
		List<Student> student=new ArrayList<>();
		student.add(new Student(13,"surya","567"));
		student.add(new Student(13,"domino","876"));
		
		transformResultsMap(person);
		List<Object> obj=new ArrayList<>();
		obj.add(person);
		try {
			transformToMap(obj);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	String s1="123,surya , 12345";
	if(s1.contains("surya")) {
		System.out.println("true");
	}
	s1.split("-");
	}

	private static <T> void transformToMap(List<T> obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		HashMap<KeyMap,List<T>> mapRs=new HashMap<KeyMap,List<T>>();
		for(T result:obj) {
			List<T> object= (List<T>) result;
			for (T results : object) {
				Field field = results.getClass().getDeclaredField("age");
				field.setAccessible(true);
				String age = (String) field.get(results);
				KeyMap map = new KeyMap(results.getClass(),age);
				if (mapRs.containsKey(map)) {
					mapRs.get(map).add(results);
				} else {
					List<T> lt = new ArrayList<>();
					lt.add(results);
					mapRs.put(map, lt);
				}
			}
	
		}
		
	}

	private static <T> void transformResultsMap(List<Person> result) {
		
    Map<KeyMap,List<Person>> mapper=new HashMap<>();	
    
    KeyMap maps=new KeyMap(null,null);
    
    mapper.put(maps, result);
    
    boolean flag=mapper.containsKey(maps);
    
	}

	private static void exception() {
		 Map<String, String> mapstr = new HashMap<>();
	        mapstr.put("12", "234");
	        mapstr.put("23", null);

	        mapstr.forEach((key, value) -> {
	        	try {
	                if (value != null) {
	                    mapstr.put(key, value.concat("hi"));
	                } else {
	                    throw new MyCustomException("Value is null for key: " + key);
	                }
	        	}catch(Exception e) {
	        		if(e instanceof MyCustomException) {
	        			//throw e;
	        		}
	        	}
	            });

		 List<String> str = Arrays.asList("surya", null, "jahf");
		    str.stream().forEach(e -> {
		        if (e != null) {
		            e = e.concat("hi");
		        } else {
		            try {
		                throw new NullPointerExceptio();
		            } catch (NullPointerExceptio customException) {
		            }
		        }
		    });
	}

	private static void mergeAlternateString() {

		String word1 = "abcd";
		String word2 = "pq";
		String output = "";
		for (int i = 0; i < (word1.length() + word2.length()); i++) {
			if(i < word1.length()) {
				output=output+word1.charAt(i);
			}
			if(i<word2.length()) {
				output=output+word2.charAt(i);
			}
		}

		System.out.println(output);

	}

	private static void printAllAnagram() {

		String s1 = "cbaebabacd";
		String s2 = "abc";
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		List<Integer> intList = new ArrayList<>();
		for(int i=0;i<s2.length();i++) {
			arr1[s1.charAt(i)-'a']++;
			arr2[s2.charAt(i)-'a']++;
		}
		int start=0;
		int end=s2.length();
		
		if(Arrays.equals(arr1, arr2)) {
			intList.add(start);
		}
		while(end<s1.length()) {
			arr1[s1.charAt(start)-'a']--;
			arr1[s1.charAt(end)-'a']++;
			
			if(Arrays.equals(arr1, arr2)) {
				intList.add(start+1);
			}
			start++;
			end++;
		}
		System.out.println(intList);
	}

	private static boolean anagram() {

			String s1="anagram";
			String s2="nagaram";
			//int count=0;
			//boolean arr[]=new boolean[256];
			if(s1.length()!=s2.length()) {
				return false;
			}
			Map<Character,Integer> hashmap=new HashMap<>();
			//Map<Character,Integer> hashmap2=new HashMap<>();

//			for (int i = 0; i < s1.length(); i++) {
//			//	if (!arr[(int) s1.charAt(i)]) {
//					for (int j = 0; j < s2.length(); j++) {
//						if (s1.charAt(i) == s2.charAt(j)) {
//							count++;
//							break;
//							//arr[(int) s2.charAt(j)] = true;
//						}
//					}
//				//}
		//
//			}
			/*for (int i = 0, j = 0; i < s2.length(); i++, j++) {
				if (hashmap.containsKey(s2.charAt(i))) {
					hashmap.put(s2.charAt(i), hashmap.get(s2.charAt(i)) + 1);
					
				} else {
					hashmap.put(s2.charAt(i), 1);
				}
				if (hashmap2.containsKey(s1.charAt(j))) {
					hashmap2.put(s1.charAt(i), hashmap2.get(s1.charAt(i)) + 1);
				} else {
					hashmap2.put(s1.charAt(j), 1);
				}
			}*/
			for(Character ch:s1.toCharArray()) {
				hashmap.put(ch, hashmap.getOrDefault(ch, 0) +1);
			}
			for(Character ch:s2.toCharArray()) {
				hashmap.put(ch, hashmap.getOrDefault(ch, 0)-1);
			}
		//	Set<Character> character=hashmap2.keySet();
			for(Integer integer:hashmap.values()) {
				if(integer!=0) {
					return false;
				}
			}
			
			return true;
//			for(Character ch:character) {
//				if(!hashmap.containsKey(ch)) {
//					return false;
//				}
//				else {
//					if(hashmap.get(ch)!=hashmap2.get(ch)) {
//						return false;
//					}
//					
//				}
//			}
//			return true;
			

			
	
	}

	private static void printLongestPalindromeWord() {
		String string = "forgeeksskeegfor";
		Map<Character, Integer> mapChar = new HashMap<>();
		List<String> palindromeStrList = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			if (mapChar.containsKey(string.charAt(i))) {
				int startIndex = mapChar.get(string.charAt(i));
				int endIndex = i;
				String palindromeStr = string.substring(startIndex, endIndex + 1);
				if (isPalindrome(palindromeStr)) {
					palindromeStrList.add(palindromeStr);
				}

			} else {
				mapChar.put(string.charAt(i), i);
			}
		}

		System.out.println(palindromeStrList.stream().max(Comparator.comparingInt(String::length)).orElse(null));
	}

	private static void OccurenceOfString() {
		String s1 = "agilesys is good";
		Map<Character, Integer> mapChar = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ' && mapChar.containsKey(s1.charAt(i))) {
				Integer count = mapChar.get(s1.charAt(i));
				mapChar.put(s1.charAt(i), count + 1);
			} else if (s1.charAt(i) != ' ') {
				mapChar.put(s1.charAt(i), 1);
			}
		}
		System.out.println();
		System.out.println("Occurence of String ");
		System.out.println(mapChar);

	}

	private static void bubbleSort() {
		int[] a = { 7, 0, 4, 6, 2, 3, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + ",");
		}

	}

	private static void printPalindromeInSentence() {
		String str = "kamak is nitin I can speak malayalam";
		String words[] = str.split(" ");
		for (String word : words) {
			if (isPalindrome(word)) {
				System.out.println(word);
			}
		}
	}

	private static boolean isPalindrome(String word) {
		int pos = 0;
		int pos2 = word.length() - 1;
		while (pos < pos2) {
			if (word.charAt(pos) != word.charAt(pos2)) {
				return false;
			}
			pos++;
			pos2--;
		}
		return true;
	}

	private static void removeOccurenceOfStr() {
		String sample = "cloudTech";
		System.out.println(sample.replaceAll("c", ""));
		String ans = "";
		for (int i = 0; i < sample.length(); i++) {
			if ((sample.charAt(i) != 'c')) {
				ans = ans + sample.charAt(i);
			}
		}
		System.out.println(ans);

	}

	private static void shiftClockwise(Integer[] a) {
		int k = 13;
		if (k > a.length)
			k = k % a.length;
		int ans[] = new int[a.length];
		for (int i = 0; i < k; i++) {
			ans[i] = a[a.length - k + i];

		}
		int index = 0;
		for (int j = k; j < a.length; j++) {
			ans[j] = a[index++];
		}
		for (int b = 0; b < ans.length; b++) {
			System.out.print(ans[b] + ",");
		}
	}
}
