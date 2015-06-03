package classes;
public class Assistant extends Lecturer {
	
	private boolean isChief;
	
	public Assistant() {
		super();
	}
	
	public Assistant(String firstName, String lastName, int experienceInYears, boolean isChief) {
		super(firstName, lastName, experienceInYears);
		this.isChief = isChief;
	}

	public void printInformation() {
		System.out.print("My name is " + this.getFirstName() + " " + this.getLastName());
		if(isChief){
			System.out.println("and I a chief assistant.");
		}
		else{
			System.out.println("and I am assistant.");
		}
	}
	
	public void writeArticle() {
		System.out.println("Writing article!");
	}
	
	public void checkHomework() {
		System.out.println("Checking homework from Assistant!");
	}
	
	public void checkExam() {
		System.out.println("Checking exam!");
	}
}