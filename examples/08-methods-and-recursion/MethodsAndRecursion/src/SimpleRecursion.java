
public class SimpleRecursion {

	public static void main(String[] args) {
		
		print(10);

	}
	
	public static void print(int number) {
	    if (number > 0) {
	    	number--;
	    	print(number);
	    	System.out.println(number);
	    } else {
		      return;
	    }
	  }

}
