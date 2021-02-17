
public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = hasSharedDigit(24, 62);
		System.out.println(result);
	}
	
	public static boolean hasSharedDigit(int number1, int number2) {
		if (number1 < 10 || number2 < 10 || number1 > 99 || number2 > 99) {
			return false;
		}
		while (number1 > 0) {
			int digit = number1 % 10;
			int temp = number2;
			while (temp > 0) {
				int digit2 = temp % 10;
				if (digit == digit2) {
					return true;
				}
				temp /= 10;
			}
			number1 /= 10;
		}
		return false;
	}
}
