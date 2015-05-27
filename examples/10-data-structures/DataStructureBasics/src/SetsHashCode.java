import java.util.HashMap;
import java.util.HashSet;

public class SetsHashCode {
	
	public static void main(String[] arguments) {
		
		Employee pesho1 = new Employee("Peter", "Petrov");
		System.out.println(pesho1.getFirstName() + " " + pesho1.hashCode());
		
		Employee pesho2 = new Employee("Peter", "Petrov");
		System.out.println(pesho2.getFirstName() + " " + pesho2.hashCode());
		
		Employee gosho = new Employee("Ivan", "Ivanov");
		System.out.println(gosho.getFirstName() + " " + gosho.hashCode());
		
		Employee ivan = new Employee("Georgi", "Georgiev");
		System.out.println(ivan.getFirstName() + " " + ivan.hashCode());
		

		HashSet<Employee> employees = new HashSet<Employee>();
		
		employees.add(pesho1);
		employees.add(pesho2);
		employees.add(gosho);
		employees.add(ivan);
		
		System.out.println();
		
		System.out.println(employees);
		
		employees.remove(ivan);
		
		System.out.println();
		
		System.out.println(employees.contains(gosho));
		
		HashMap<Employee, Integer> dictionary = new HashMap<Employee, Integer>();
		
		dictionary.put(pesho1, 1);
		dictionary.put(pesho2, 2);
		dictionary.put(gosho, 1);
		dictionary.put(ivan, 4);
		
		System.out.println();
		System.out.println(dictionary.size());
		

	}
}
