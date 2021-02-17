
public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(8);

	}
	
	public static void printSquareStar(int number) {
		if (number < 5) {
			System.out.println("Invalid Value");
			return;
		}
		String line = "";
		for (int j = 0; j < number; j++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i < number - 1; i++) {
			for (int j = 0; j < number; j++) {
				if (j == 0 || j == i || j == number - i - 1 || j == number - 1) {
					line = line.concat("*");					
				} else {
					line = line.concat(" ");
				}
			}
			System.out.println(line);
			line = "";
		}
		for (int j = 0; j < number; j++) {
			System.out.print("*");
		}
	}
}
