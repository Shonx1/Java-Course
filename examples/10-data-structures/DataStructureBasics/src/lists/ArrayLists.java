package lists;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> people = new ArrayList<String>();
		
		people.add("Ivan");
		people.add("Konstantin");
		people.add("Atanas");
		people.add("Todor");
		
		for(int i = 0; i < people.size(); i++){
			System.out.print(people.get(i) + " ");
		}
		
		System.out.println();
		
		people.add("Georgi"); 
		
		people.set(2, "Anton");
		people.add(3, "Peter"); 
		
		for (String name : people) {
		    System.out.print(name + " ");
		}
		
		System.out.println();
		
		people.remove(0);
		
		//Index re-ordering
		
		people.remove(1); 
		people.remove("Georgi");
		
		String[] test = new String[]{"Test", "Test1"};
		
		people.addAll(Arrays.asList("Teodora", "Martin")); 
		people.addAll(2, Arrays.asList(test));
		
		System.out.println();
		System.out.println(people);

			
	}

}