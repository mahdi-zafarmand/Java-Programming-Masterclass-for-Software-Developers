
public class Mitsubishi extends Car {
	
	public Mitsubishi(int _cylinders, String _name) {
		super(_cylinders, _name);
	}
	
	public String startEngine() {
		return "The Mitsubishi engine is starting.";
	}
	
	public String accelerate() {
		return "The Mitsubishi is accelerating.";
	}
	
	public String brake() {
		return "The Mitsubishi is braking.";
	}
}
