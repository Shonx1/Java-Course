package substring;

public class StringSubstring {

	public static void main(String[] args) {
		String expression = "Strings are powerful";
		
		String firstPart = expression.substring(0, 6);
		System.out.println(firstPart);
		
		String seondPart = expression.substring(8, 11);
		System.out.println(seondPart);
		
		String thirdPart = expression.substring(12);
		System.out.println(thirdPart);
	}
}