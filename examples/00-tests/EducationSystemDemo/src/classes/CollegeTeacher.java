package classes;
public class CollegeTeacher extends Teacher {
	
	private String collegeName;
	
	public CollegeTeacher() {
		super();
	}
	
	public CollegeTeacher(String firstName, String lastName, int experienceInYears, String college) {
		super(firstName, lastName, experienceInYears);
		this.collegeName = college;
	}
	
	public void checkHomework() {
		super.checkHomework();
	}
}
