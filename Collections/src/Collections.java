import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
		Person p = new Person("Email@mas.com","A");
		Person q = new Person("Other@mas.com","S");
		Person b = new Person("Email@mas.com","A");
		
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
		
		// Generic functions
		System.out.println("\n"+"Generic Functions:");
		//Item<String> item = new Item<String>();
		Pair<Person, Person> item = new Pair<Person, Person>();
		Person pp = new Person("hello","hello");
		item.setX(pp);
		item.getX();
		item.setY(p);
		item.getX();		
		Person p3 = item.getX();
		
		Pair<Integer,String> pair = new Pair<Integer,String>();
		pair.setX(7);
		pair.setY("My fav number!");
		
		Pair<Integer,String> pair2 = new Pair<Integer,String>();
		pair2.setX(70);
		pair2.setY("My fav number x 10!");
		
		ArrayList<Pair<Integer,String>> pears = new ArrayList<Pair<Integer,String>>();
		pears.add(pair);
		pears.add(pair2);
		
		// derived class from the Person class
		
		ArrayList<Person> peopleCairo = new ArrayList<Person>();
		Admin a = new Admin();
		people.add(a);
		//doSomething(a);
		// Although there is inheritance from Person to Admin
		// No inheritance for ListOf Persons to ListOf Admins
		
		ArrayList<Admin> admins = new ArrayList<Admin>();
		
		ArrayList<Person> adminsP = new ArrayList<Person>();
		for(Admin admin : admins) {
			adminsP.add((Person)admin);
		}
		doSomething(adminsP);

		
		//
		System.out.println("\n"+"Generic Wildcards and Casting Lists:");
		doSomething(admins);
		
		// Alternatively: Casting in one line
		List<Person> people3 = (List<Person>)(List<?>)admins;
		//doSomething(people3);
	}
	/*
	static void doSomething(Person p) {
		System.out.println(p);
	}*/

	/*static void doSomething(ArrayList<Person> peeps) {
		
	}*/
	
	// This means that any ArrayList of a type that extends Person is acceptable
	static void doSomething(ArrayList<? extends Person> peeps) {
	
	}
	

}







