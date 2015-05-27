package dictionary;

//import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;


public class TreeMaps {
	
	public static void main(String[] args) {
		String[] words = { 
			"yes", "hello", "black", "red", "word", "no", "red",
			"zebra", "yes", "network", "red", "rabbit", "red",
			"network", "programming", "red", "word", "red"
		};
		
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
		//HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
				
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count + 1);
		}
		
		Set<String> wordKeys = wordsCount.keySet();
		
		System.out.println();
		
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			System.out.printf("%s -> %d times\n", word, count);
		}
		
		System.out.println(wordsCount);
	}
}
