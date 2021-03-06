package exceptions;

public class E03_ThrowingException {

	public static void main(String[] args) {
		
		Person person = new Person("John", 12);
		
		try {
			person.setAge(-11);
			
			System.out.println("Age: " + person.getAge());
		} catch (IllegalArgumentException exception) {
			System.out.println("An error: " + exception.getMessage());
		}

	}

}

class Person {
	
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		
		if(age < 0){
			throw new IllegalArgumentException("Age cannot be negative!");
		}
		
		this.age = age;
	}


}
