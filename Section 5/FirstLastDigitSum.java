
public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sumFirstAndLastDigit(1234);
		System.out.println(result);
	}
	
	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		int firstDigit = number % 10;
		int lastDigit = 0;
		while (number > 0) {
			lastDigit = number % 10;
			number = number / 10;
		}
		return firstDigit + lastDigit;
	}
}
