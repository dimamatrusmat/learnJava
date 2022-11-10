import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class Linked {
	public static void main (String [] args) {
		
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		Map<Integer, String> linkedMap = new LinkedHashMap<>();
		
		testMap(linkedMap);
		
	}
	
	public static void testMap (Map<Integer, String> map) {
		
		map.put(39, "Bob");
		map.put(12, "Hob");
		map.put(78, "Tob");
		map.put(0, "Djob");
		map.put(1500, "Vlob");
		map.put(7, "Glob");
		map.put(79, "Trop");
		
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
}