
public class Cylinder extends Circle {

	private double height;
	
	public Cylinder(double _radius, double _height) {
		super(_radius);
		height = (_height < 0) ? 0 : _height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}
}
