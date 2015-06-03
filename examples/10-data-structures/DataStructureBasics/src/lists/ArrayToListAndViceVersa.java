package lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListAndViceVersa {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ivan");
		list.add("Konstantin");
		list.add("Atanas");
		list.add("Todor");
		
		//Object[] arrayFromList = list.toArray();
		String[] arrayFromList = list.toArray(new String[list.size()]);
		
		for (Object string : arrayFromList) {
			String temp = string.toString();
			System.out.println(string);
		}
		
		System.out.println();
		
		String[] array = new String[]{"Maria", "Ivana", "Gergana", "Ivelina"};
		
		List<String> listFromArray = Arrays.asList(array);
		
		for (String item : listFromArray) {
			System.out.println(item);
		}
			
	}

}