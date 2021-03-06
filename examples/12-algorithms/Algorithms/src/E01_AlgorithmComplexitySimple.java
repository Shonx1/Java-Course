public class E01_AlgorithmComplexitySimple {

	public static void main(String[] args) {
		
		int[] numbers = {1, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, 9, 11, 12, 13, 14, 14, 15, 15};
		
		int countCouples = 0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				
				int first = numbers[i];
				int second = numbers[j];
				 
				if(first == second){
					countCouples++;
					break;
				}
			}
		}
		
		//Complexity: O(N^2)
		
		
		System.out.println("Count: " + countCouples);
		
		countCouples = 0;
		
		for (int i = 1; i < numbers.length; i++) {
			
			int first = numbers[i - 1];
			int second = numbers[i];
			
			if (first == second) {
				countCouples++;
			}
		}
		
		System.out.println("Count: " + countCouples);	
		
		//Complexity: O(N)
		
	}

}
