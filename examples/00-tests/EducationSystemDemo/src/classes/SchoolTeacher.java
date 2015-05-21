package classes;
public class SchoolTeacher extends Teacher {

	private String[] classesList;
	
	public SchoolTeacher() {
		super();
		classesList = new String[5];
	}
	
	public SchoolTeacher(String firstName, String lastName, int experienceInYears, String[] classesList) {
		super(firstName, lastName, experienceInYears);
		this.classesList = classesList;
	}
	
	public void checkHomework() {
		super.checkHomework();
	}
	
	public void printClassesListInformation() {
		System.out.println("The Classes:");
		for (int i = 0; i < classesList.length; i++) {
			System.out.print(classesList[i]);
		}
	}
	
	public void entertain() {
		System.out.println("Entertain! Party!");
	}
}
