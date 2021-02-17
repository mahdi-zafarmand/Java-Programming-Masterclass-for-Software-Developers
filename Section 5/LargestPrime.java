
public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestPrime(21));
	}

	public static int getLargestPrime(int number) {
		if (number < 2) {
			return -1;
		}
		
		int largestPrime = 0;
		int i = 2;
		while (number > 1) {
			if (number % i == 0) {
				largestPrime = i;
				number /= i;
			} else {
				i += 1;
			}
		}
		return largestPrime;
	}
}
