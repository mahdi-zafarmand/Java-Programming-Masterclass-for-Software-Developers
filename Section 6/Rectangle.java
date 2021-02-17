
public class Rectangle {

	private double width, length;
	
	public Rectangle(double _width, double _length) {
		width = (_width < 0) ? 0 : _width;
		length = (_length < 0) ? 0 : _length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return width * length;
	}	
}
