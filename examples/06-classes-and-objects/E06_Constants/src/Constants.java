
public class Constants {

	public static void main(String[] args) {
		TimeSpan week = new TimeSpan(7);
		System.out.println("One week has " + week.calculateHours() + " hours");
		System.out.println("One week has " + week.calculateMinutes() + " minutes");
		
		TimeSpan month = new TimeSpan(30);
		System.out.println("One month has " + month.calculateHours() + " hours");
		System.out.println("One month has " + month.calculateMinutes() + " minutes");

	}

}
