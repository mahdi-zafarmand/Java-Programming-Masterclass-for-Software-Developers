
public class Floor {

	private double width, length;
	
	public Floor(double _width, double _length) {
		width = (_width < 0) ? 0 : _width;
		length = (_length < 0) ? 0 : _length;
	}
	
	public double getArea() {
		return width * length;
	}
}
