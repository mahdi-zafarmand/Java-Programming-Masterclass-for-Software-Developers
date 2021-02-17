
public class Circle {

	private double radius;
	
	public Circle(double _radius) {
		radius = (_radius < 0) ? 0 : _radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.pow(radius, 2.0) * Math.PI;
	}
}
