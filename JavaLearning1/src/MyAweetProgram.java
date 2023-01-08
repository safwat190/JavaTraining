import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MyAweetProgram {
	
	Collection<String> stuff;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("Files/test.txt"));
		
		LinkedList<String> names = new LinkedList<String>();
		
		while(in.hasNextLine()) {
			names.add(in.nextLine());
		}
		
		for(int i =0; i < names.size();i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("\n"+"Iterators");
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n"+"For each");
		for(String s: names) {
			System.out.println(s);
		}
		
		System.out.println("\n"+"List Iterators");
		ListIterator<String> listit = names.listIterator();
		listit.next();
		listit.next();
		listit.add("Susan");
		for(String s: names) {
			System.out.println(s);
		}
	}
}












