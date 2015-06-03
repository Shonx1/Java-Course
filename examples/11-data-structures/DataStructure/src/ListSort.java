import java.util.ArrayList;
import java.util.Comparator;

public class ListSort {
	
	
	public static void main(String[] args) {
		ArrayList<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("Lazar", "Sestrimski"));
		list1.add(new Person("Zlatko", "Zlatanov"));
		list1.add(new Person("Georgi", "Georgiev"));
		list1.add(new Person("Hristo", "Hristov"));
		
		list1.sort(new CustomComparator());
		
		for (Person person : list1) {
			System.out.println(person);
		}
		
	}
	    



}
