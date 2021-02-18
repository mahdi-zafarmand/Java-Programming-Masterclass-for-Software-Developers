import java.util.*;
public class MobilePhone {

	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String number) {
		this.myNumber = number;
		this.myContacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact) {
		boolean successful = false;
		if(this.findContact(contact) < 0) {
			this.myContacts.add(contact);
			successful = true;
		}
		return successful;
	}
	
	public boolean updateContact(Contact oldContact, Contact newContact) {
		boolean exists = false;
		int index = this.findContact(oldContact);
		if(index >= 0) {
			this.myContacts.remove(index);
			this.myContacts.add(newContact);
			exists = true;
		}
		return exists;
	}
	
	public boolean removeContact(Contact contact) {
		boolean exists = false;
		int index = this.findContact(contact);
		if(index >= 0) {
			this.myContacts.remove(index);
			exists = true;
		}
		return exists;
	}
	
	private int findContact(Contact contact) {
		return this.findContact(contact.getName());
	}

	private int findContact(String name) {
		int index = -1;
		for(int i = 0; i < this.myContacts.size(); i++) {
			if(this.myContacts.get(i).getName() == name) {
				index = i;
				break;
			}
		}
		return index;
	}

	public Contact queryContact(String name) {
		int index = this.findContact(name);
		if(index == -1) {
			return null;
		} else {
			return this.myContacts.get(index);
		}
	}
	
	public void printContacts() {
		System.out.println("Contact List:");
		for(int i = 0; i < this.myContacts.size(); i++) {
			System.out.println(i+1 + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
		}
	}
}
