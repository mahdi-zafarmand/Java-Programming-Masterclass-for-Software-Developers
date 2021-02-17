
public class Car {

	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	public Car(int _cylinders, String _name) {
		cylinders = _cylinders;
		name = _name;
		engine = true;
		wheels = 4;
	}
	
	public String startEngine() {
		return "The Car engine is starting.";
	}
	
	public String accelerate() {
		return "The Car is accelerating.";
	}
	
	public String brake() {
		return "The Car is braking.";
	}
	
	public int getCylinders() {
		return cylinders;
	}
	
	public String getName() {
		return name;
	}
}
