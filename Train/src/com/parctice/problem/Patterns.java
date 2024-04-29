package com.parctice.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Patterns {

	public static void main(String[] args) {
//		printTriangularNos();
//		noIncreasingPyramidPattern();
//		rotateDigitsToRight();
//		topKElements();
//		printTriangleStar();
//		longestCommonSequence();
		topKEleemntsOptimized();
	}

	private static int[] topKEleemntsOptimized() {
		int a[] = { 9, 11, 10, 3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6 };
		int k = 10;
		System.out.println(a.length);
		List<Integer> bucket[] = new ArrayList[a.length];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		System.out.println(map);
		for (int key : map.keySet()) {
			int freq = map.get(key);
			if (bucket[freq] == null) {
				bucket[freq] = new ArrayList<>();
			}
			bucket[freq].add(key);
		}
		int res[] = new int[k];
		int z = 0;
		for (int i = bucket.length - 1; i >= 0; i--) {
			if (bucket[i] != null) {
				for (int key : bucket[i]) {
					res[z++] = key;
					if (z == k) {
						break;
					}
				}
				if(z==k) {
					break;
				}
			}
		}
		for (int j = 0; j < k; j++) {
			System.out.print(res[j]+" ");

		}
		return res;
	}

	private static void longestCommonSequence() {
		String s1 = "ezupkr", s2 = "ubmrapg";
		int size = Math.max(s1.length(), s2.length());
		Set<Character> subString = new HashSet<>();
		if (size == s1.length()) {
			List<Character> ch = new ArrayList<>();
			for (Character c : s1.toCharArray()) {
				ch.add(c);
			}
			for (Character cc : s2.toCharArray()) {
				if (ch.contains(cc)) {
					subString.add(cc);
				}
			}
		} else {
			List<Character> ch = new ArrayList<>();
			for (Character c : s2.toCharArray()) {
				ch.add(c);
			}
			for (Character cc : s1.toCharArray()) {
				if (ch.contains(cc)) {
					subString.add(cc);
				}
			}
		}
		System.out.println(subString.size());
	}

	private static void printTriangleStar() {

		int n = 6;
		// outer loop to handle rows
		for (int i = 1; i <= n; i++) {
			// inner loop to handle space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print nos
			for (int z = 1; z <= i; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void topKElements() {
		int a[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6 };
		int k = 10;
		List<Integer> values = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
				values.add(map.get(a[i]));
			} else {
				map.put(a[i], 1);
				values.add(map.get(a[i]));
			}
		}
		// 1-1,5-3
		System.out.println(map);
		Collections.sort(values, Collections.reverseOrder());
		List<Integer> out = new ArrayList<>();
		Integer ans[] = new Integer[k];

		for (int g = 0; g < k; g++) {
			for (Map.Entry<Integer, Integer> d : map.entrySet()) {

				if (!out.contains(d.getKey()) && d.getValue() == values.get(g)) {
					out.add(d.getKey());
					ans[g] = d.getKey();
					break;
				}
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");

		}
	}

	private static void rotateDigitsToRight() {
		int n[] = { 5, 7, 9, 4, 2, 6, 7 };
		int k = 5, z = 0;
		if (k > n.length)
			k = k % n.length;
		int rem = n.length - k;
		int s[] = new int[rem];
		for (int i = 0; i < rem; i++) {
			s[i] = n[i];
		}
		for (int h = 0; h < k; h++) {
			n[h] = n[n.length - k + h];
		}
		for (int j = k; j < n.length; j++) {
			n[j] = s[z++];
		}

		for (int g = 0; g < n.length; g++) {
			System.out.print(n[g] + " ");

		}
	}

	private static void noIncreasingPyramidPattern() {
		int n = 5;
		// outer loop to handle rows
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void printTriangularNos() {
		int n = 6;
		// outer loop to handle rows
		for (int i = 1; i <= n; i++) {
			// inner loop to handle space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print nos
			for (int z = 1; z <= i; z++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
