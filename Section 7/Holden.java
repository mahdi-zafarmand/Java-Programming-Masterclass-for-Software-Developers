
public class Holden extends Car {

	public Holden(int _cylinders, String _name) {
		super(_cylinders, _name);
	}
	
	public String startEngine() {
		return "The Holden engine is starting.";
	}
	
	public String accelerate() {
		return "The Holden is accelerating.";
	}
	
	public String brake() {
		return "The Holden is braking.";
	}
}
