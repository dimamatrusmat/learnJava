import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main (String [] args) {

		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
	}
	
}