
public class Point {

	private int x, y;
	
	public Point() {}
	
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int _x) {
		x = _x;
	}

	public void setY(int _y) {
		y = _y;
	}

	public double distance() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public double distance(int _x, int _y) {
		return Math.sqrt(Math.pow((x - _x), 2) + Math.pow((y - _y), 2));
	}
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
