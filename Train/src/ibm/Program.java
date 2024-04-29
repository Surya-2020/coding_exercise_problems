package ibm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		compressedString();
		decompressString();
		convertPhoneNosToString();
		findRepetitionOfDigits();

	}

	private static void findRepetitionOfDigits() {

		int start = 100, end = 120;
		List<Integer> output=new ArrayList<>();
		for (int i = start; i <= end; i++) {
			if(checkRepetitionOfDigits(i)) {
				output.add(i);
			}
		}
		System.out.println(output);
	}

	private static boolean checkRepetitionOfDigits(int i) {
		String s = String.valueOf(i);
		List<Character> listCh = new ArrayList<>();
		for (char ch : s.toCharArray()) {
			if (listCh.contains(ch)) {
				return true;
			}
			listCh.add(ch);
		}
		return false;
	}

	private static void convertPhoneNosToString() {
		String s = "8885646667788";
		Map<Character, String> map = new HashMap<>();
		map.put('1', "One");
		map.put('2', "two");
		map.put('3', "three");
		map.put('4', "four");
		map.put('5', "five");
		map.put('6', "six");
		map.put('7', "seven");
		map.put('8', "eight");
		map.put('9', "nine");
		map.put('0', "zero");
		StringBuilder sb = new StringBuilder();
		char prev = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			char current = s.charAt(i);
			if (prev == current) {
				count++;
			} else {
				// append repeated counts
				if (count > 1) {
					sb.append(getCount(count)).append(" ");
				}
				// append prev char
				sb.append(map.get(prev)).append(" ");

				count = 1;
				prev = current;
			}
		}

		if (count > 1) {
			sb.append(getCount(count)).append(" ");

		}
		sb.append(map.get(prev)).append(" ");
		System.out.println(sb.toString());
	}

	private static Object getCount(int count) {

		return count == 2 ? "double" : "triple";
	}

	private static void decompressString() {
		String s = "a7b1c1d3f3g2h2";
		Character ch = null;
		Integer len = null;
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				ch = s.charAt(i);
			} else {
				len = Character.getNumericValue(s.charAt(i));
				for (int j = 0; j < len; j++) {
					output = output + ch;
				}
			}
		}
		System.out.println(output);

	}

	private static void compressedString() {
		String s = "aaaabcdddaaafffgghh";

		Map<Character, Integer> map = new HashMap<>();
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		String output = "";
		for (Map.Entry<Character, Integer> keyValue : map.entrySet()) {
			output = output + keyValue.getKey() + keyValue.getValue();
		}

		System.out.println(output);

	}
}