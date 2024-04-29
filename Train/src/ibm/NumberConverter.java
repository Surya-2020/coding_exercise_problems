package ibm;

public class NumberConverter {
	public static String convertNumberToString(String numberString) {
		String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		StringBuilder result = new StringBuilder();

		int count = 1;
		char prevDigit = numberString.charAt(0);

		// Convert each digit//888564666778
		for (int i = 1; i < numberString.length(); i++) {
			char digit = numberString.charAt(i);

			if (digit == prevDigit) {
				count++;
			} else {
				// Append repeated digits
				if (count > 1) {
					result.append(getRepeatWord(count)).append(" ");
				}
				// Append current digit
				result.append(digits[Character.getNumericValue(prevDigit)]).append(" ");

				count = 1;
				prevDigit = digit;
			}
		}

		// Append the last digit
		if (count > 1) {
			result.append(getRepeatWord(count)).append(" ");
		}
		result.append(digits[Character.getNumericValue(prevDigit)]);

		return result.toString().trim();
	}

	private static String getRepeatWord(int count) {
		return count == 2 ? "double" : "triple";
	}

	public static void main(String[] args) {
		Long start=System.currentTimeMillis();
		String number = "8885646667788";
		String convertedString = convertNumberToString(number);
		System.out.println(System.currentTimeMillis()-start);
		System.out.println(convertedString);
	}
}
