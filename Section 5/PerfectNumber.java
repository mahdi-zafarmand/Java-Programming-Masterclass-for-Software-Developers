
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isPerfectNumber(6);
		System.out.println(result);

	}
	
	public static boolean isPerfectNumber(int number) {
		if (number < 1) {
			return false;
		}
		int sumDivisors = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sumDivisors += i;
			}
		}
		return (sumDivisors == number) ? true : false;
	}
}
