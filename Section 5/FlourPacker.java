
public class FlourPacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPack(1, 0, 4));

	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal > 5 * bigCount + smallCount) {
			return false;
		}
		while (bigCount > 0 && goal >= 5) {
			bigCount -= 1;
			goal -= 5;
		}
		while (smallCount > 0 && goal > 0) {
			smallCount -= 1;
			goal -= 1;
		}

		return (goal == 0) ? true : false;
	}
}
