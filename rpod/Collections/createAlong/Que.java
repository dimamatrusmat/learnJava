import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class Test {
	
	public static void main (String [] arsg) {
		Person p1 = new Person(1, "Along");
		Person p2 = new Person(2, "Dulong");
		Person p3 = new Person(3, "SAlong");
		Person p4 = new Person(4, "ZAlong");
		Person p5 = new Person(5, "KAlong");
		Person p6 = new Person(6, "QAlong");
		Person p7 = new Person(7, "WAlong");
		
		
		
		Queue<Person> peole = new ArrayBlockingQueue<>(10);
		System.out.println(peole.offer(p2));
		System.out.println(peole.offer(p3));
		System.out.println(peole.offer(p1));
		System.out.println(peole.offer(p2));
		System.out.println(peole.offer(p3));
		System.out.println(peole.offer(p1));
		System.out.println(peole.offer(p2));
		System.out.println(peole.offer(p3));
		System.out.println(peole.offer(p1));
	System.out.println(peole.offer(p2));
		System.out.println(peole.offer(p3));
		System.out.println(peole.offer(p1));
		System.out.println(peole.offer(p2));
		System.out.println(peole.offer(p3));
		System.out.println(peole.offer(p1));
	
		
		System.out.println(peole.remove());
		System.out.println(peole.peek());
		
		for (Person person: peole) 
			System.out.println(person);
		
	}
	
}

public class Person {
	private int id;
	private String name;
	
	public Person (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
	
	@Override
	public int hashCode() {
		return 31 * id + (name != null ? name.hashCode() : 0);
	}
	
	@Override 
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || o.getClass() != this.getClass()) return false;

		Person person = (Person) o;
		
		if (person.id != this.id) return false;
		return (name != null ? name.equals(person.name) : person.name == null);
		
		
	}
}