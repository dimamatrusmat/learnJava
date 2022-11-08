import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Test {
	
	public static void main(String [] args) {
		List <Integer> linkedList = new LinkedList<>();
		List <Integer> arrayList = new ArrayList<>();
		
		
		measureTime(arrayList, "arrayL");
		measureTime(linkedList , "linkedL");
		
	}
	
	private static void measureTime(List<Integer> list, String st) {
		
		///for (int i = 0; i < 10000; i++) {
		//	list.add(i);
		//}
		
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 500000; i++) {
			list.add(0, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(st + " " + (end-start));
		
	}
	
}