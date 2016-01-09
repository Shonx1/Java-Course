package concatenation;

public class E04_SpeedTestConcatenation {

	public static void main(String[] args) {
		int number = 50000;//1000, 10000, 50000, 100000???
		String concatenator = "Repeated Sentances ";
		String str = "";
		
		long start1 =  System.currentTimeMillis();
		for(int i = 0; i < number; i++){
			str += concatenator;
		}
		long end1 = System.currentTimeMillis();
		long result1 = end1 - start1;
		System.out.println("The result in miliseconds: " + (result1) + " = " + (result1 / 1000) + " seconds!");
		
		
		StringBuilder sb = new StringBuilder();
		
		long start2 =  System.currentTimeMillis();
		for(int i = 0; i < number; i++){
			sb.append(concatenator);
		}
		long end2 = System.currentTimeMillis();
		
		long result2 = end2 - start2;
		System.out.println("The result in miliseconds: " + (result2) + " = " + (result2 / 1000) + " seconds!");
		
		System.out.println("Comparing two string and the results is: " + sb.toString().equals(str));
		

	}

}