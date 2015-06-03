package reading.files;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;;


public class ReadingAllLines {

	public static void main(String[] args) {
		
//		readAllLines("../files/programming.txt");
		readAllLines("..\\files\\programming.txt");

	}
	
	public static void readAllLines(String file){
		
		try {
			
			Path path = Paths.get(file);
			
			List<String> lines = Files.readAllLines(path);
			
			for (String line : lines) {
				 System.out.println(line);
			}
			
			
		} catch (IOException e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

}
