import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Collections;




public class HashTest {
	
	public static void main(String [] args) {
		List<Person> pepleList = new ArrayList<>();
		Set<Person> peopleSet = new TreeSet<>();
		
		addElements(pepleList);
		Collections.sort(pepleList);	
		System.out.println(pepleList);
		
		addElements(peopleSet);
		System.out.println(peopleSet);
	}
	
	private static void addElements(Collection col) {
		col.add(new Person(3, "Dima"));
		col.add(new Person(2, "Shasa"));
		col.add(new Person(3, "Lexs"));	
		col.add(new Person(1, "Geotge"));	
	}
	
}


public class Person implements Comparable<Person>{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id =  id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		int result;
		result = id;
		
		return result*31+(name != null ? name.hashCode() : 0);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Person per = (Person) o;
		
		if (id != per.id) return false;
		return name != null ? name.equals(per.name) : per.name == null;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
	
	//@Override
	//public int compareTo(Person o) {
		//if (this.id > o.getId()) {
		//	return 1;
		//} else if (this.id < o.getId()) {
		//	return -1;
		//} else {
		//	return 0;
	//	}
	//}
	
	@Override
	public int compareTo(Person o) {
		if (this.getName().length() > o.getName().length()) {
			return 1;
		} else if (this.getName().length() < o.getName().length()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}