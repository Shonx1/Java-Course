package classes;
public class Professor extends Lecturer {
	
	private String title;
	
	public Professor() {
		super();
	}
	
	public Professor(String firstName, String lastName, int experienceInYears, String title) {
		super(firstName, lastName, experienceInYears);
		this.title = title;
	}
	
	public void printInformation() {
		System.out.print("My title is " + title);
		System.out.println("and I had " + this.getExperienceInYears() + " years of working experience: ");
	}
	
	public void checkHomework() {
		System.out.println("Checking homework from Professor.");
	}
	
	public void createExam() {
		System.out.println("Create exam!");
	}
}