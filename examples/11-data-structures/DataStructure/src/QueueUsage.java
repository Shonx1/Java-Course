import java.util.LinkedList;
import java.util.Queue;;

public class QueueUsage {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("One");
		
		queue.offer("Two");
		
		queue.offer("Three");
		
		queue.offer("Four");
		
		while (!queue.isEmpty()) {
			
			String current = queue.poll();
			
		    System.out.println(current);
		    
		}
	}
}