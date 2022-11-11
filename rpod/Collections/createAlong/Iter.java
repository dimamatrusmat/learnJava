import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


public class Test {
	
	public static void main (String [] arsg) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Iterator<Integer> iterator = list.iterator();
		
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		
		System.out.println(list);
		
		
		// Java 5
		//for (int x: list)
		//	System.out.println(x);
	}
	
}
