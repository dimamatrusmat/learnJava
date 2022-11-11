import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Test {
	public static void main (String [] args) {
		List<String> list = new ArrayList<>();
		
		list.add("along");
		list.add("zulong");
		list.add("43");
		list.add("tolobn");
		list.add("bilong");
		list.add("1");
		
		Collections.sort(list, new StringLenghtComparator());
		System.out.println(list);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(521);
		numbers.add(1100);
		numbers.add(300);
		numbers.add(0);
		
		//Collections.sort(numbers,  new integerLenghtComparator());
		Collections.sort(numbers,  new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				
				if (o1 > o2) {
					return -1;
				} else if (o1 < o2) {
					return 1;
				} else {
					return 0;
				}
			}
			
		});
		System.out.println(numbers);
	}
	
}
class integerLenghtComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		} else {
			return 0;
		}
	}
}

class StringLenghtComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		
		if (o1.length() > o2.length()) {
			return 1;
		} else if (o1.length() < o2.length()) {
			return -1;
		} else {
			return 0;
		}
	}
}