import java.util.Stack;

public class StackUsage {

	public static void main(String[] args) {
		
		Stack<String> myStack = new Stack<String>();
		
		myStack.push("One");
		
		myStack.push("Two");
		
		myStack.push("Three");
		
		myStack.push("Four");
		
		while(!myStack.isEmpty()){
			
			String current = myStack.pop();
			
			System.out.println(current);
		}

	}
}
