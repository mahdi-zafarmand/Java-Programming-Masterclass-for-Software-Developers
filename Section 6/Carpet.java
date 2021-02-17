
public class Carpet {

	private double cost;
	
	public Carpet(double _cost) {
		cost = (_cost < 0) ? 0 : _cost;
	}
	
	public double getCost() {
		return cost;
	}
}
