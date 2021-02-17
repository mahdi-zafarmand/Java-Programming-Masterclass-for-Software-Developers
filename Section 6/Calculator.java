
public class Calculator {

	private Floor floor;
	private Carpet carpet;
	
	public Calculator(Floor _floor, Carpet _carpet) {
		floor = _floor;
		carpet = _carpet;
	}
	
	public double getTotalCost() {
		return floor.getArea() * carpet.getCost();
	}
}
