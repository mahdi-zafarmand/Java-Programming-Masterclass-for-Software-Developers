
public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberToWords(10);
	}
	
	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
			return;
		}
		int digitCount = getDigitCount(number);
		number = reverse(number);
		String word, words;
		word = words = "";
		int lastDigit;

		while (number > 0) {
			lastDigit = number % 10;
			number /= 10;
			digitCount -= 1;

			switch (lastDigit) {
				case 0:
					word = "Zero";
					break;
				case 1:
					word = "One";
					break;
				case 2:
					word = "Two";
					break;
				case 3:
					word = "Three";
					break;
				case 4:
					word = "Four";
					break;
				case 5:
					word = "Five";
					break;
				case 6:
					word = "Six";
					break;
				case 7:
					word = "Seven";
					break;
				case 8:
					word = "Eight";
					break;
				case 9:
					word = "Nine";
					break;
				default:
					word = "";
			}
			words = words.concat(word);
			words = words.concat(" ");
		}
		
		while (digitCount > 0) {
			words = words.concat("Zero ");
			digitCount -= 1;
		}
		System.out.println(words);
	}
	
	public static int reverse(int number) {
		int reversedNumber = 0;
		boolean neg = (number > 0) ? false : true;
		if (neg == true) {
			number = -number;
		}
		while (number > 0) {
			reversedNumber *= 10;
			reversedNumber += number % 10;
			number /= 10;
		}
		return (neg == true) ? -reversedNumber : reversedNumber;
	}
	
	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}
		int numDigits = 0;
		while (number > 0) {
			numDigits += 1;
			number /= 10;
		}
		return numDigits;
	}
}
