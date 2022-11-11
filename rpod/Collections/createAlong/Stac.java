import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;


public class Test {
	
	public static void main (String [] arsg) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(5);
		stack.push(3);
		stack.push(1);
		
		while (!stack.empty()) {
			System.out.println(stack.pop());

		}
		
		
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