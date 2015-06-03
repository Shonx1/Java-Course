package classes;
public class Teacher extends Person {

	private String subjectName;
	
	public Teacher() {
		super();
	}
	
	public Teacher(String firstName, String lastName, int experienceInYears) {
		super(firstName, lastName, experienceInYears);
	}
	
	public Teacher(String firstName, String lastName, int experienceInYears, String subjectName) {
		super(firstName, lastName, experienceInYears);
		this.subjectName = subjectName;
	}

	@Override
	public void checkHomework() {
		System.out.println("Checking homework from Teacher");
	}
	
	public void goodbyeGreet() {
		System.out.println("Goodbye!");
	}
}