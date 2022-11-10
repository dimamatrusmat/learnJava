import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;


public class Test {
	
	public static void main(String [] args) {
		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		Set<String> linkedSet = new LinkedHashSet<>();
		
		setSet(treeSet);
	}
	
	public static void setSet(Set<String> set) {
		set.add("Katy");
		set.add("Jeny");
		set.add("zery");
		set.add("Keby");
		set.add("Seby");
		set.add("Aeby");
		set.add("Keby");
		
		for (String name: set) {
			System.out.println(name);
		}
	}
	
}