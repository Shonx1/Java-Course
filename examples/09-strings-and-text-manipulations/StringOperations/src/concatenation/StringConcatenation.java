package concatenation;
public class StringConcatenation {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
        
		sb.append("This is ");
		sb.append("the ");
		sb.append("most effective ");
		sb.append("way to concatenate ");
		sb.append("Strings ");
		sb.append(" :) ");
		      
		System.out.println(sb.toString());
	}
}