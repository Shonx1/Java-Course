package writing.file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class E10_WritingFIles {

	public static void main(String[] args) {

		String filePath = "../output/randomNumbers.txt";

		Random rand = new Random();

		try {
	
			FileWriter fileStream = new FileWriter(filePath);
//			FileWriter fileStream = new FileWriter(filePath, true);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			for (int i = 0; i < 10; i++) {
				Integer number = rand.nextInt(100);
				writer.write(number.toString());
				writer.newLine();
			}
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("The file is success.");
	}

}