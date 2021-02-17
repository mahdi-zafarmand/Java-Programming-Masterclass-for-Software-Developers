
public class SimpleCalculator {

	private double firstNumber, secondNumber;
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public double getSecondNumber() {
		return secondNumber;
	}

	public void setFirstNumber(double number) {
		firstNumber = number;
	}
	
	public void setSecondNumber(double number) {
		secondNumber = number;
	}
	
	public double getAdditionResult() {
		return firstNumber + secondNumber;
	}
	
	public double getSubtractionResult() {
		return firstNumber - secondNumber;
	}

	public double getMultiplicationResult() {
		return firstNumber * secondNumber;
	}
	
	public double getDivisionResult() {
		return (secondNumber == 0) ? 0 : firstNumber / secondNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
