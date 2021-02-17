
public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getEvenDigitSum(2000);
		System.out.println(result);
	}

	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		int sum = 0;
		while (number > 0) {
			sum += (number % 2 == 0) ? number % 10 : 0;
			number /= 10;
		}
	return sum;
	}
}
