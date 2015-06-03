public class ArraysDemo3 {

	public static void main(String[] args) {
		
		String academy = "Java World";
		
		for (int i = 0; i < academy.length(); i++) {
			char symbol = academy.charAt(i);
			System.out.printf("Symbol with index " + i + " : " + symbol);
			System.out.println();
		}
		
		System.out.println();
		
		char[] academyArray = academy.toCharArray();
		
		for (int i = 0; i < academyArray.length; i++) {
			System.out.printf("Index " + i + " : " + academyArray[i]);
			System.out.println();
		}
	}
}