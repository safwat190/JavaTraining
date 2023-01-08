import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		// Arrays
		int[] ages = new int[5];
		ages[0] = 5;

		// 2d arrays
		int[][] ages2 = new int[5][];
		ages2[0] = new int[10];
		ages2[1] = new int[5];
		
		// Lists
		ArrayList<Integer> ages3 = new ArrayList<Integer>();
		ages3.add(5);
		
		// Passing a person's name and getting the id
		// HashMap
		HashMap<String, Integer> ids = new HashMap<String, Integer>();
		ids.put("Ahmed Safwat", 800140700);
		ids.put("Ahmed Elbaz", 800145700);
		ids.put("Ahmed Safwat", 800145000);
		ids.put("Ahmed Elbaz", ids.get("Ahmed Elbaz")+1);
		
		System.out.println(ids.get("Ahmed Safwat"));
		System.out.println(ids.get("Ahmed Elbaz"));
		
		ids.put("Ahmed Elbaz", ids.getOrDefault("INVALID NAME",-1)+1);
		System.out.println(ids.get("Ahmed Elbaz"));
		
		Set<String> keys = ids.keySet();
		
		System.out.println("\n"+"Printing the keys...");
		for(String key : keys) {
			System.out.println(key);
			System.out.println(ids.get(key));
			
		}
		
		// Hash method takes an object and returns integer
		// Every class in java inherits from object class
		String s = "Hello!";
		System.out.println(s.hashCode());
		
		// Override hash code and equals
		System.out.println("\n"+"Override hash code and equals!");
		Person p = new Person("Email@mas.com");
		Person q = new Person("Other@mas.com");
		Person b = new Person("Email@mas.com");
		
		// Comparing different emails
		System.out.println(p == q);
		System.out.println(p.equals(q));
		
		// Comparing same emails
		System.out.println(p == b);
		System.out.println(p.equals(b));
		
		// Above code gave wrong results
		// This is becasue we didn't define how equals method works
		// We need to override the equals method
		// Then, it became true
		
		// HashSet
		System.out.println("\n"+"HashSet:");
		String hello = "hello";
		String bye = "bye";
		
		HashSet<String> words = new HashSet<String>();
		words.add(hello);
		words.add(bye);
		
		for(String j : words) {
			System.out.println(j);
		}
		System.out.println(words.contains("hello")); // in ~one operation
		// Problem: working with custom types, 
		
		System.out.println("\n"+"HashSet for custom types:");
		HashSet<Person> people = new HashSet<Person>();
		people.add(p);
		people.add(q);
		
		System.out.println(people.contains(p));
		
		//
		HashMap<String,Person> peeps = new HashMap<String,Person>();
		peeps.put("Email@mas.com",p);
		System.out.println("\n"+"Dictionary of custom objects \nkey is email!:");
		System.out.println(peeps.containsKey("Email@mas.com"));
	}

}







