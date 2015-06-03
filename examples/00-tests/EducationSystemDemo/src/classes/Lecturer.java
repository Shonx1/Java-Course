package classes;
public class Lecturer extends Person {

	public static final int maxLectures = 10;
	
	private String universityName;

	public Lecturer() {
		super();
	}
	
	public Lecturer(String firstName, String lastName, int experienceInYears) {
		super(firstName, lastName, experienceInYears);
	}
	
	public Lecturer(String firstName, String lastName, int experienceInYears, String universityName) {
		super(firstName, lastName, experienceInYears);
		this.universityName = universityName;
	}
	
	@Override
	public void checkHomework() {
		System.out.println("Checking homework from Lecturer");
	}
	
	public void doExercise() {
		System.out.println("Do exercise without parameters!");
	}
	
	public void doExercise(String firstExercise) {
		System.out.println("Do exercise with 1 parameter: " + firstExercise + "!");
	}
	
	public void doExercise(String firstExercise, String secondExercise) {
		System.out.println("Do exercise with 2 parameters: " + firstExercise + " and " + secondExercise + "!");
	}
}