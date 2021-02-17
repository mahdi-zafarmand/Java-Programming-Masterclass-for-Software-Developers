
public class Bed {

	private String style;
	private int pillows, height, sheets, quilt;
	
	public Bed(String _style, int _pillows, int _height, int _sheets, int _quilt) {
		style = _style;
		pillows = _pillows;
		height = _height;
		sheets = _sheets;
		quilt = _quilt;
	}
	public void make() {
		System.out.println("The bed is being made.");
	}
	
	public String getStyle() {
		return style;
	}
	
	public int getPillows() {
		return pillows;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getSheets() {
		return sheets;
	}
	
	public int getQuilt() {
		return quilt;
	}
}
