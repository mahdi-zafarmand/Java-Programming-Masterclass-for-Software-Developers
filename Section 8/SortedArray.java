import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

	public static int[] getIntegers(int size) {
		int[] array = new int[size];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		return array;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		boolean[] pickedItems = new boolean[array.length];
		for(int i = 0; i < array.length; i++) {
			pickedItems[i] = false;
		}
		
		int maxValue, index = 0;
		for(int j = 0; j < array.length; j++) {
			maxValue = (int) Integer.MIN_VALUE;
			for(int i = 0; i < array.length; i++) {
				if(pickedItems[i] == false && array[i] > maxValue) {
					maxValue = array[i];
					index = i;
				}
			}
			sortedArray[j] = maxValue;
			pickedItems[index] = true;
		}
		return sortedArray;
	}
	
	public static void main(String[] args) {
		int[] unsortedArray = getIntegers(5);
		int[] sortedArray = sortIntegers(unsortedArray);
		System.out.println(Arrays.toString(sortedArray));
	}
}
