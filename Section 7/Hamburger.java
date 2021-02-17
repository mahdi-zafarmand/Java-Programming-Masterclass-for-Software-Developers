
public class Hamburger {

	private double price;
	private String name, meat, breadRollType;
	
	private String addition1Name, addition2Name, addition3Name, addition4Name;
	private double addition1Price, addition2Price, addition3Price, addition4Price;
	
	public Hamburger(String name, String meat, double price, String breadRollType) {
		this.price = price;
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.addHamburgerAddition1("", 0.0);
		this.addHamburgerAddition2("", 0.0);
		this.addHamburgerAddition3("", 0.0);
		this.addHamburgerAddition4("", 0.0);
	}
	
	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}

	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}

	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}

	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double itemizeHamburger() {
		return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
	}
}
