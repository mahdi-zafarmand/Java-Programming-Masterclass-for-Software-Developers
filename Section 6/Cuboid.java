
public class Cuboid extends Rectangle{

	private double height;
	
	public Cuboid(double _width, double _length, double _height) {
		super(_width, _length);
		height = (_height < 0) ? 0 : _height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}
}
