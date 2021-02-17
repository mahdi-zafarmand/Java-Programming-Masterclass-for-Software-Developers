
public class Ford extends Car {

	public Ford(int _cylinders, String _name) {
		super(_cylinders, _name);
	}
	
	public String startEngine() {
		return "The Ford engine is starting.";
	}
	
	public String accelerate() {
		return "The Ford is accelerating.";
	}
	
	public String brake() {
		return "The Ford is braking.";
	}
}
