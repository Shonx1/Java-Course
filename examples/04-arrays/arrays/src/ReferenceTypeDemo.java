
public class ReferenceTypeDemo {
	public static void main(String[] args) {
		
//		int[] test = { 1, 2, 3, 4, 5 };
		
//		for (int i : test) {
//			System.out.print(i + " ");
//		}
//		
//		int[] deepCopyTest = new int[test.length];
//		
//		for (int i = 0; i < test.length; i++) {
//			deepCopyTest[i] = test[i];
//		}
//		System.out.println();
//
//		for (int i : deepCopyTest) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//
//		deepCopyTest[2] = 55;
//		
//		for (int i : test) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//
//		for (int i : deepCopyTest) {
//			System.out.print(i + " ");
//		}
		
	
		int[] test = { 1, 2, 3, 4, 5 };		

		for(int i = 0; i< test.length; i++){
			System.out.print(test[i] + " ");
		}
		System.out.println();
		
		int[] newTest = test;
		
		for(int i = 0; i< newTest.length; i++){
			System.out.print(newTest[i] + " ");
		}
		
		test[0] = 20;
		
	
		System.out.println();
		
		for(int i = 0; i< test.length; i++){
			System.out.print(test[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i< newTest.length; i++){
			System.out.print(newTest[i] + " ");
		}
	}
}