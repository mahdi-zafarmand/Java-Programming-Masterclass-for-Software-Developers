
public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = hasSameLastDigit(19, 345, 789);
		System.out.println(result);
	}
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if (isValid(num1) == false || isValid(num1) == false || isValid(num1) == false) {
			return false;
		}
		int digit1 = num1 % 10;
		int digit2 = num2 % 10;
		int digit3 = num3 % 10;
		
		if (digit1 == digit2 || digit1 == digit3 || digit2 == digit3) {
			return true;
		}
		return false;
	}
	
	public static boolean isValid(int number) {
		if (number < 10) {
			return false;
		}
		return (number > 1000) ? false : true;
	}
}
