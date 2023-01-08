import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyAweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("Files/test.txt"));
		
		List<String> names = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			names.add(in.nextLine());
		}
		
		for(int i =0; i < names.size();i++) {
			System.out.println(names.get(i));
		}
		/*Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] grades = new int[size];
		
		for(int i =0; i < size; i++) {
			grades[i] = in.nextInt();
		}
		in.close();
		
		for(int i =0; i < size; i++) {
			System.out.println(grades[i]);
		}*/
	}
}
