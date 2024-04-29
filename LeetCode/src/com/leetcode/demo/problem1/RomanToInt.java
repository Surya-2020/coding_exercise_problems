package com.leetcode.demo.problem1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {

		String sample = "CM";
		Integer value = romanToInt(sample);
		System.out.println(value);
	}

	private static Integer romanToInt(String sample) {
		Map<Character, Integer> romanToInt = new HashMap<>();
		romanToInt.put('I', 1);
		romanToInt.put('V', 5);
		romanToInt.put('X', 10);
		romanToInt.put('L', 50);
		romanToInt.put('C', 100);
		romanToInt.put('D', 500);
		romanToInt.put('M', 1000);
		Integer output = 0;
		int counter = 1;
		int a[] = new int[10];
	//	int z=0;
		for (int i = sample.length() - 1; i >= 0; i--) {
			if (sample.charAt(i) == 'I' || sample.charAt(i) == 'V' || sample.charAt(i)=='X' || sample.charAt(i)=='L' ||sample.charAt(i)=='C' || sample.charAt(i)=='D' || sample.charAt(i)=='M') {
				char c = sample.charAt(i);
				Integer val = c == 'I' ? romanToInt.get('I') : c=='V'?romanToInt.get('V'):c=='X'?romanToInt.get('X'):c=='L'?romanToInt.get('L'):c=='C'?romanToInt.get('C'):c=='D'?romanToInt.get('D'):romanToInt.get('M');
				a[i] = val;
				if ( ((counter==2 || counter==4 || counter==6) && (a[i+1] == 5 && a[i] == 1 )|| ( a[i+1]==10 && a[i]==1) || (a[i+1]==50 && a[i]==10) || ( a[i+1]==50 && a[i]==10) || ( a[i+1]==100 && a[i]==10) || ( a[i+1]==100 && a[i]==10) || ( a[i+1]==500 && a[i]==100) || (a[i+1]==1000 && a[i]==100))){
					output = Math.abs(output - val);
				} else {
					output += val;
				}
			}
			counter++;
		}
	
	
		return output;
	}
}
