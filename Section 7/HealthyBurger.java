
public class HealthyBurger extends Hamburger {

	private String healthyExtra1Name, healthyExtra2Name;
	private double healthyExtra1Price, healthyExtra2Price;
	
	public HealthyBurger(String meat, double price) {
		super("", meat, price, "");
		this.addHealthyAddition1("", 0.0);
		this.addHealthyAddition2("", 0.0);
	}
	
	public void addHealthyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}

	public void addHealthyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;		
	}
	
	public double itemizeHamburger() {
		return super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
	}

}
