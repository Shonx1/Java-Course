public class Person {
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String firstName;
	private String lastName;
	
	Person(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
		
		
	}
	public String toString(){
		return getFirstName() + " " + getLastName();
	}
	

}