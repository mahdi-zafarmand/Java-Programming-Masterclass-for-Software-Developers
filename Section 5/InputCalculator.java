import java.util.Scanner;


public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputThenPrintSumAndAverage();

	}
	
	public static void inputThenPrintSumAndAverage() {
		int newNumber, count, sum;
		newNumber = 0; count = 0; sum = 0;
		
		Scanner myObj = new Scanner(System.in);
		while (myObj.hasNextInt()) {
		    newNumber = myObj.nextInt();
			sum += newNumber;
			count += 1;
		}
		myObj.close();
		double average = (double) sum / count;
		System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
	}
}
