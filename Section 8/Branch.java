import java.util.*;

public class Branch {

	private String name;
	private ArrayList<Customer> customers;
	
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}
	
	private Customer findCustomer(String name) {
		for(Customer customer : this.customers) {
			if(customer.getName() == name) {
				return customer;
			}
		}
		return null;
	}
	
	public boolean newCustomer(String name, double initialTransaction) {
		if(this.findCustomer(name) == null) {
			this.customers.add(new Customer(name, initialTransaction));
			return true;
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String name, double transaction) {
		Customer customer = this.findCustomer(name);
		if(customer != null) {
			customer.addTransaction(transaction);
			return true;
		}
		return false;
	}
}
