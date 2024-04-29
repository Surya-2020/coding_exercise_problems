package com.parctice.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci extends AbstractDemo{

	public static void main(String[] args) {

		findFibonacciSeries();
		findFrequencyElement();
		findAllSubsetOfString();
		longestRepeatingSequence();
		findFrequencyOfString();
		optimizedFrequencyOfString();
		findMaxSubArray();
		findLargestArraySum();
		reverseInteger();
		moveZeroToLast();
		System.out.println(findValidParantheses());
	}

	private static void moveZeroToLast() {
		int a[]= {1,5,0,5,0,1,0};
		int z=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[z++]=a[i];
			}
		}
		while(z<a.length) {
			a[z++]=0;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
	}

	private static boolean findValidParantheses() {
		String str = "{[(]})";
		Map<Character, Character> map = new HashMap<>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		ArrayList<Integer> index = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) != null && map.containsValue(map.get(str.charAt(i)))) {
				index.add(str.indexOf(map.get(str.charAt(i))));
			} else if (i == 0) {
				return false;
			} else if (index.contains(i)) {
				continue;
			} else {
				return false;
			}
		}
		return true;

	}

	private static int findLargestArraySum() {
		int arr[] = { 1, -2, -10, 9, -5, 9, 6, 8 };
		int k = 23;
		for (int i = 0; i < arr.length; i++) {
			int maxArrSum = 0;
			for (int j = i; j < arr.length; j++) {
				maxArrSum += arr[j];
				if (maxArrSum == k) {
					System.out.println("The start position and end position of maximum sum of subArray " + i + " " + j);
					return 1;
				}
			}

		}
		System.out.println("No sub array found");
		return 0;

	}

	private static void reverseInteger() {
		int n = 546, rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		System.out.println(rev);

	}

	private static void findMaxSubArray() {
		int arr[] = { 1, -2, 6, 9, -5, 9, 6, 8 };
		int k = 3;
		int maxArrSum = 0;
		for (int i = 0; i < arr.length - k + 1; i++) {
			int maxSum = 0;
			for (int j = i; j < k + i; j++) {
				maxSum += arr[j];
			}
			if (maxSum > maxArrSum) {
				maxArrSum = maxSum;
			}

		}

		System.out.println(maxArrSum);

	}

	private static void optimizedFrequencyOfString() {
		String str = "hello all how are you";
		HashMap<Character, Integer> occurences = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				if (occurences.containsKey(ch)) {	
					occurences.put(ch,occurences.get(ch)+1 );
				} else {
					occurences.put(ch, 1);
				}
			}
		}
		System.out.println(occurences);

	}

	private static void findFrequencyOfString() {
		String str = "hello all how are you";
		String s2 = str.replaceAll(" ", "");
		System.out.println(s2);
		int visited = -1;
		int arr[] = new int[s2.length()];
		for (int i = 0; i < s2.length(); i++) {
			int counter = 1;
			for (int j = i + 1; j < s2.length(); j++) {
				if (s2.charAt(i) == s2.charAt(j)) {
					arr[j] = visited;
					counter++;
				}
			}
			if (arr[i] != visited) {
				arr[i] = counter;
			}
		}

		for (int i = 0; i < s2.length(); i++) {
			if (arr[i] != visited) {
				System.out.println("The frequency of characters " + s2.charAt(i) + "The no. of occurences " + arr[i]);
			}
		}

	}

	private static void longestRepeatingSequence() {

		long start = System.currentTimeMillis();
		String str = "abcdeabcdgf";
		int n = str.length();
		String lrc = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String st = longestRepeatingChar(str.substring(i, n), str.substring(j, n));
				if (st.length() > lrc.length()) {
					lrc = st;
				}
			}
		}

		System.out.println("Longest Repeating sequence :" + lrc + " Timetaken to execute this "
				+ (System.currentTimeMillis() - start));

	}

	private static String longestRepeatingChar(String s, String t) {
		int min = Math.min(s.length(), t.length());
		for (int i = 0; i < min; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, min);
	}

	private static void findAllSubsetOfString() {
		String str = "SURYA";
		String subSet[] = new String[((str.length()) * (str.length() + 1)) / 2];
		int z = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				subSet[z] = str.substring(i, j + 1);
				z++;
			}
		}
		for (int h = 0; h < subSet.length; h++) {
			System.out.print(subSet[h] + " ");
		}
		System.out.println();

	}

	private static void findFrequencyElement() {
		int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int freq[] = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}
		System.out.println();
		System.out.println("Element  |  Frequency ");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != visited)
				System.out.println(arr[i] + "           " + freq[i]);
		}

	}

	private static void findFibonacciSeries() {
		long a = 0, b = 1, c;
		int n = 5;
		long output[] = new long[n];
		output[0] = b;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			output[i] = c;
		}
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		return;
	}

	@Override
	public String m1() {
		// TODO Auto-generated method stub
		return null;
	}
}
