
public class Person {

	private String firstName, lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}

	public void setLastName(String name) {
		lastName = name;
	}

	public void setAge(int number) {
		age = (number < 0 || number > 100) ? 0 : number;
	}

	public boolean isTeen() {
		return (age > 12 && age < 20) ? true : false;
	}
	
	public String getFullName() {
		String fullName = "";
		if (firstName.isEmpty() && lastName.isEmpty() == false) {
			fullName = lastName;
		} else if (firstName.isEmpty() == false && lastName.isEmpty()) {
			fullName = firstName;
		} else if (firstName.isEmpty() == false && lastName.isEmpty() == false) {
			fullName = firstName + " " + lastName;
		}
		return fullName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
