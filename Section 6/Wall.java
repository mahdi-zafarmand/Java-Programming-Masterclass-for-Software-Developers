
public class Wall {

	private double width, height;
	
	public Wall() {}
	
	public Wall(double _width, double _height) {
		setWidth(_width);
		setHeight(_height);
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double _width) {
		width = (_width < 0) ? 0 : _width;
	}
	
	public void setHeight(double _height) {
		height = (_height < 0) ? 0 : _height;
	}
	
	public double getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
