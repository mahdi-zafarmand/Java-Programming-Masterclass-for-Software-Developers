
public class Lamp {

	private String style;
	private boolean battery;
	private int globRating;
	
	public Lamp(String _style, boolean _battery, int _globRating) {
		style = _style;
		battery = _battery;
		globRating = _globRating;
	}
	
	public void turnOn() {
		System.out.println("Lamp is being turned on.");
	}
	
	public String getStyle() {
		return style;
	}
	
	public boolean isBattery() {
		return battery;
	}
	
	public int getGlobRating() {
		return globRating;
	}
}
