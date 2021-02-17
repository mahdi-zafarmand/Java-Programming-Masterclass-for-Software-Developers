
public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isPalindrome(123);
		System.out.println(result);
	}

	public static boolean isPalindrome(int number) {
		if (number<0) {
			number = -number;
		}
		String numberString = String.valueOf(number);
		for (int i=0; i<numberString.length() / 2 + 1; i++) {
			if (numberString.charAt(i) != numberString.charAt(numberString.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
