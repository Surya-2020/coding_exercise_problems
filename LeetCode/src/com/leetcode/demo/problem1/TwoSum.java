package com.leetcode.demo.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class TwoSum {

	static {
		System.out.println("Print me 1st");

	}

	public static void main(String[] args) {

		twoSum();
		 twoSumUsingDS();
		 subString();
		 optimizeSubString();
		 streamapi();
		 hashmapSubString();
		 System.out.println(buudyString());
		System.out.println(sumNums(4));
		string();
	System.out.println(Arrays.toString(duplicateElements()));
		System.out.println( Arrays.toString(middleFunction()));
		System.out.println(twoSumUsingHashMap());
		 System.out.println(buddyStringNew());
		 splitByChunkSize();
		 System.out.println(validationOfParathesis());
		 System.out.println(validPalindrome());
		 bestTimeToBuyAndSellStock();

	}
	
	

	private static int[] duplicateElements() {
		int arr[] = { 1, 2, 2, 1, 3, 4, 3 };// 7
		int newArr[] = new int[arr.length - 3];
		int newDupIndex[]=new int[3];
		int z = 0;
	   for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				arr[j]=Integer.MIN_VALUE;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<0) {
			continue;
		}else {
			newArr[z++]=arr[i];
		}
	}
		
		return newArr;

	}

	private static int[] middleFunction() {

      
        int array[]= {1,2,3,4};
        int newArr[] = new int[array.length-2];
        for(int i=0,z=0;i<array.length;i++){
            if(i==0 || i==array.length-1){
                continue;
            }else{
                newArr[z]=array[i];
                z++;
            }
        }
        return newArr;
    
	}

	private static int sumNums(int a) {
		if (a == 0) {
			return 0;
		}
		System.out.println(a);
		int total=a + sumNums(a - 1);
		System.out.println(total);
		return total;
	}

	private static void string() {
		String s1 = null;
		String s2 = null;
		System.out.println(s1 + s2);
		Map<String, String> map1 = new HashMap<>();
		map1.put(null, "surya");
		map1.put(null, "io");
		map1.put("1", "isro");
		String s = map1.get(null);

	}

	private static boolean buddyStringNew() {
		String s = "sssb";
		String goal = "sssb";

		if (s.length() != goal.length()) {
			return false;
		}

		if (s.equals(goal)) {
			Set<Character> set = new HashSet<>();
			for (Character ch : s.toCharArray()) {
				set.add(ch);
			}
			return set.size() < goal.length();
		}

		int i = 0;
		int l = s.length() - 1;

		while (i < l && s.charAt(i) == goal.charAt(i)) {
			i++;
		}

		while (l >= 0 && s.charAt(l) == goal.charAt(l)) {
			l--;
		}

		if (i < l) {
			char arr[] = s.toCharArray();
			char temp = arr[i];
			arr[i] = arr[l];
			arr[l] = temp;
			s = new String(arr);
		}
		if (s.equals(goal)) {
			return true;
		}

		return false;

	}

	private static boolean buudyString() {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
		String goal = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
		// List<String> list = new ArrayList<>();

		long s1 = System.currentTimeMillis();
		System.out.println("Execution starts" + s1);
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				StringBuffer temp1 = new StringBuffer(s);
				Character c1 = temp1.charAt(i);
				Character c2 = temp1.charAt(j);
				temp1.setCharAt(j, c1);
				temp1.setCharAt(i, c2);
				if (temp1.toString().equals(goal)) {

					long s2 = System.currentTimeMillis();
					System.out.println("Execution ends" + s2);
					System.out.println("Time taken" + (s2 - s1));
					return true;
				}
				// list.add(temp1.toString());
				System.out.println(temp1);
			}
		}

		System.out.println();
//		System.out.println(list);
//		if(list.contains(goal)) {
//			return true;
//		}else {
//			return false;
//		}
		return false;

	}

	private static void streamapi() {
		List<String> s1 = Arrays.asList("surya", "karthik", "suresh");
		s1 = s1.stream().filter(f -> f.startsWith("s")).collect(Collectors.toList());
		System.out.println(s1.toString());

	}

	private static void bestTimeToBuyAndSellStock() {
		int prices[] = { 7, 1, 5, 3, 6, 4, 10, 17 };
		int profit = 0;
		int min = prices[0], max = 0;
		for (int i = 0; i < prices.length -1; i++) {
			
			  min = Math.min(prices[i], min);
				/*
				 * max = Math.max(prices[i + 1] - min, max);
				 */
			
				if (prices[i + 1] - min > profit) {
					profit = prices[i + 1] - min;
				}
			 
			 
		}
		System.out.println(profit);
		// System.out.println( "Time stocks were bought on "+bought+" day" + " Time
		// stocks were sold on " + sold+" day"+" Total profit made "
		// +bestTimeToSellStock);
	}

	private static boolean validPalindrome() {
		String str = "0p";
		StringBuilder correctStr = new StringBuilder();
		for (Character c : str.toCharArray()) {
			int value = c.charValue();
			if (value != 32) {
				if ((value >= 97 && value <= 122) || (value >= 48 && value <= 57)) {
					correctStr.append(c);
				} else if (value >= 65 && value <= 90) {
					correctStr.append(Character.toLowerCase(c));
				}
			}
		}
		int rit = 0;
		int lef = correctStr.length() - 1;
		while (rit < lef) {
			if (correctStr.charAt(rit) != correctStr.charAt(lef)) {
				return false;
			} else {
				rit++;
				lef--;
			}
		}
		return true;

	}

	private static boolean validationOfParathesis() {
		String str = ")}";
		Stack<Character> stack = new Stack<>();
		for (Character c : str.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '{') {
				stack.push('}');
			} else if (c == '[') {
				stack.push(']');
			} else if (stack.empty() || stack.pop() != c) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	private static void splitByChunkSize() {
		int arr[] = { 1, 4, 5, 8, 9, 3, 7, 8, 9, 2 };
		int chunksize = 3, j = 0;
		int remainderParts = 0;
		int chunks[];
		if (arr.length % chunksize != 0) {
			remainderParts = arr.length % chunksize;
		}
		for (int reps = 1; reps <= arr.length / chunksize; reps++) {
			chunks = new int[chunksize];
			// List<Integer> list=new ArrayList<>();
			int counter = 0, z = 0;
			System.out.println("The chunk size " + reps);
			for (int i = j; i < arr.length; i++) {
				if (counter == chunksize) {
					j = i;
					break;
				} else {
					chunks[z] = arr[i];
					// list.add(arr[i]);
					counter++;
					z++;
				}
			}
			// System.out.println(list);
			if (reps == chunksize && remainderParts > 0) {
				System.out.println("The remainder chunks " + remainderParts);
				int x = 0;
				chunks = new int[remainderParts];
				List<Integer> lists = new ArrayList<>();
				for (int c = j; c < arr.length; c++) {
					chunks[x] = arr[c];
					// lists.add(arr[c]);
					System.out.println(lists);
					x++;
				}
			}
		}

	}

	private static void hashmapSubString() {
		String s = "aabcdca";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		List<String> subString = new ArrayList<>();
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			subString.add(s.substring(j, i + 1));
			map.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
		}
		String largestSubString = subString.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(map.keySet());
		System.out.println(max);
		System.out.println(largestSubString);

	}

	private static void optimizeSubString() {
		String str = "javaconceptoftheday";
		int res = 0, z = 0, k = 0;
		String f = "";
		for (int i = 0; i < str.length(); i++) {
			boolean visited[] = new boolean[256];
			for (int j = i; j < str.length(); j++) {
				if (visited[str.charAt(j)] == true) {
					f = "";
					k = 0;
					break;
				} else {
					res = Math.max(res, j - i + 1);
					z += i;
					k += j;
					f += str.charAt(j);
					// System.out.println("The max value " + res + " character " + str.charAt(j));
					visited[str.charAt(j)] = true;
				}
			}
			visited[str.charAt(i)] = false;
		}
		System.out.println(res);
		System.out.println(f);
	}

	private static void subString() {
		String s = "p";
		Map<Character, List<Integer>> map = new HashMap<>();
		List<Integer> positionList = null;
		List<String> subStringList = new ArrayList<>();
		boolean noReptition = true;
		List<String> correctdsubString = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			positionList = new ArrayList<>();
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					positionList.add(j);
					noReptition = false;
				}
			}
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), positionList);
			}

		}
		System.out.println(map);
		if (!noReptition) {
			processSubString(map, subStringList, correctdsubString, s);
		} else {
			correctdsubString.add(s);
		}

		System.out.println(correctdsubString);
	}

	private static void processSubString(Map<Character, List<Integer>> map, List<String> subStringList,
			List<String> correctdsubString, String s) {
		for (int j = 0; j < map.size(); j++) {
			List<Integer> posLists = map.get(s.charAt(j));
			for (int z = 0; z < posLists.size(); z++) {
				subStringList.add(s.substring(j, posLists.get(z)));
			}
		}
		System.out.println(subStringList);

		for (int y = 0; y < subStringList.size(); y++) {
			String subString = subStringList.get(y);
			boolean remove = false;
			for (int g = 0; g < subString.length(); g++) {
				for (int n = g + 1; n < subString.length(); n++) {
					if (subString.charAt(g) == subString.charAt(n)) {
						remove = true;
					}
				}
			}
			if (!remove) {
				correctdsubString.add(subString);
			}
		}

	}

	private static void twoSumUsingDS() {
		List<Integer> intList = Arrays.asList(4, 9, 0, 8, 3);
		LinkedList<String> ll=new LinkedList<>();
		List<Integer> indices = new ArrayList<>();
		int target = 12;
		for (int i = 0; i < intList.size(); i++) {
			if (intList.contains(target - intList.get(i))) {
				indices.add(i);
				indices.add(intList.indexOf(target - intList.get(i)));
				break;
			}
		}
		System.out.println(indices);
	}

	private static int[] twoSumUsingHashMap() {
		int[] arr = { 4, 9, 0, 8, 3 };
		int target = 12;
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hashMap.containsKey(target - arr[i])) {
				return new int[] { hashMap.get(target - arr[i]),i };
			} else {
				hashMap.put(arr[i], i);
			}
		}
		return null;

	}

	private static void twoSum() {
		int[] arr = { 4, 9, 0, 8, 3 };
		int target = 7;
		int indices[] = new int[2];
		int z = 0;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					indices[z] = i;
					z++;
					indices[z] = j;
					found = true;
				}
			}

		}
		for (int j = 0; j < indices.length; j++) {
			System.out.println(indices[j]);
		}
	}

}
