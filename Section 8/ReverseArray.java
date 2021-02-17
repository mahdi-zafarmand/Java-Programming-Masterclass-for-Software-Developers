import java.util.Arrays;

public class ReverseArray {

	private static void reverse(int[] array) {
		System.out.println("Array = " + Arrays.toString(array));
		int tempValue = 0;
		for(int i = 0; i < array.length / 2; i++) {
			tempValue = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tempValue;
		}
		System.out.println("Reversed array = " + Arrays.toString(array));
	}
}
