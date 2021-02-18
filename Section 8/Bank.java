import java.util.*;

public class Bank {

	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	private Branch findBranch(String branchName) {
		for(Branch branch : this.branches) {
			if(branch.getName() == branchName) {
				return branch;
			}
		}
		return null;
	}
	
	public boolean addBranch(String name) {
		Branch branch = this.findBranch(name);
		if(branch == null) {
			this.branches.add(new Branch(name));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double transaction) {
		Branch branch = this.findBranch(branchName);
		if(branch != null) {
			return branch.newCustomer(customerName, transaction);
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
		Branch branch = this.findBranch(branchName);
		if(branch != null) {
			return branch.addCustomerTransaction(customerName, transaction);
		}
		return false;
	}
	
	public boolean listCustomers(String branchName, boolean printTransactions) {
		Branch branch = this.findBranch(branchName);
		if(branch != null) {
			System.out.println("Customer details for branch " + branch.getName());
			ArrayList<Customer> customers = branch.getCustomers();
			for(int i = 0; i < customers.size(); i++) {
				System.out.println("Customer: " + customers.get(i).getName() + '[' + (i+1) + ']');
				if(printTransactions == true) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = customers.get(i).getTransactions();
					for(int j = 0; j < transactions.size(); j++) {
						System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
					}					
				}
			}
			return true;
		}
		return false;
	}
}
