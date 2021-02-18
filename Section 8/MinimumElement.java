import java.util.Scanner;

public class MinimumElement {

	private static int readInteger() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		return number;
	}
	
	private static int[] readElements(int size) {
		int[] elements = new int[size];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			elements[i] = scanner.nextInt();
		}
		scanner.close();
		return elements;
	}
	
	private static int findMin(int[] array) {
		int minValue = (int) Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			minValue = Math.min(minValue, array[i]);
		}
		return minValue;
	}
}
