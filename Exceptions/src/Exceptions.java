import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Exceptions {

	public static void main(String[] args) {
		// Exceptions are run time errors
		
		// Example 1
		//int number = Integer.parseInt("pizza");
		
		// Example 2
		//ArrayList<Integer> x = new ArrayList<Integer>();
		//x.get(54);
		
		// Example 3
		//FileInputStream f = new FileInputStream("");
		
		Exceptions exceptions = new Exceptions();
		exceptions.doSomething();
		
	}
	
	// The method that throws the exception must deal with the exception
	void doSomething() {
		try {
		throw new IOException();
		}catch(IOException | IndexOutOfBoundsException e) {
			System.out.println("Yes! More Specific must be first!");
		}
		catch(Exception e) {
			System.out.println("Yes! More general (to be second)!");
			e.printStackTrace();
		}
	}
}
