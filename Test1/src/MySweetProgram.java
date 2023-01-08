import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		/*// System.out.println("Hi");
		System.out.println("Choose a number to divide  by 3?");
		
		Scanner scanner = new Scanner(System.in);
		//String name = scanner.nextLine();
		int y = scanner.nextInt();
				
		//String test_string = "Hey ";
		//System.out.println(test_string + name);
		
		int z = 3;
		System.out.println(y/z);*/
		
		/*User user = new User();
		user.firstName = "Ahmed";
		user.lastName = "Safwat";
		System.out.println(user.getFullName());*/
		
		/*System.out.println("Who are you?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		switch(name)
		{
		case "Ahmed":
			System.out.println("Hi Ahmed");
			break;
		case "Safwat":
			System.out.println("Hi Safwat");
			break;
		default:
			System.out.println("Try again later!");
			break;
		}*/
		
		/*System.out.println("Guess the password: ");
		String password = "pass";
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		while (!guess.equals(password))
		{
			System.out.println("Write your password again");
			guess = scanner.nextLine();
		}
		System.out.println("Congrats!");
		scanner.close(); // free the memory from that scanner*/
		
		/*String password = "pass";
		Scanner scanner = new Scanner(System.in);
		String guess;
		do
		{
			System.out.println("Guess the password:");
			guess = scanner.nextLine();
		} while(!guess.equals(password));
		System.out.println("Congrats!");
		scanner.close();*/
		
		// Declare an array
		//int[] grades = new int[10];
		//grades[0] = 10;
		//System.out.println(grades[0]);
		//int[] grades = {10,9,8,7,6,5,4,3,2,1};
		//System.out.println(grades[2]);
		//System.out.println(Arrays.toString(grades));
		//System.out.println(Arrays.deepToString(grades)); // for array of arrays		
		//int size = grades.length;
		//System.out.println(size);
		
		//sort
		//Arrays.sort(grades);
		//Arrays.parallelSort(grades); //For very large arrays
		
		/*int[] grades2 = {10,9,8,7,6,5,4,3,2,1};
		
		if (Arrays.equals(grades, grades2)) {
			System.out.println("equal");
		}
		
		int[] grades3 = new int[10];
		Arrays.fill(grades3, 5);
		System.out.println(Arrays.toString(grades3));*/
		
		// Lists
		/*List<Integer> grades = new ArrayList<Integer>();
		System.out.println(grades);
		System.out.println(grades.size());
		System.out.println(grades.isEmpty());
		grades.add(null);
		grades.add(null);
		grades.add(5);
		System.out.println(grades);
		System.out.println(grades.size());
		System.out.println(grades.get(1));
		grades.add(0,10);
		System.out.println(grades);
		System.out.println(grades.size());
		System.out.println(grades.indexOf(null));
		System.out.println(grades.contains(null));
		grades.remove(null);
		System.out.println(grades);
		grades.clear();
		System.out.println(grades);*/
		
		/*Integer[] temp = {1,2,3,4,5};
		List<Integer> grades2 = Arrays.asList(temp);
		System.out.println(grades2);
		System.out.println(Arrays.toString(grades2.toArray()));
		
		for(int i =0; i < grades2.size(); i++)
		{
			//System.out.println(grades2.get(i));
			grades2.set(i, grades2.get(i)*2);
			System.out.println(grades2.get(i));
		}
		
		//for each
		for(int grade : grades2)
		{
			System.out.println(grade);
		}*/
		
		//Nested for each loop
		List<List<Integer>> grades = new ArrayList<List<Integer>>();
		grades.add(Arrays.asList(5,3,4,6,7));
		grades.add(Arrays.asList(3,2,1));
		grades.add(Arrays.asList(3,2,1,10,12));
		
		int counter=0;
		for(int i=0;i<grades.size();i++)
		{
			System.out.println("Row: "+i);
			for(int j=0;j<grades.get(i).size();j++)
			{
				System.out.println(grades.get(i).get(j));
			}
		}
		System.out.println("\n"+"For each");
		for(List<Integer> row : grades)
		{
			System.out.println(row);
			for(int grade : row)
			{
				System.out.println(grade);
			}
		}
		
		//Convert list into array
		List<Integer> allGrades = Arrays.asList(5,4,5,23,2);
		int[] new_array = new int[allGrades.size()];
		
		for(int i = 0; i < allGrades.size();i++)
		{
			new_array[i] = allGrades.get(i);
			System.out.println(Arrays.toString(new_array));
		}
		
		// Sorting a list
		Collections.sort(allGrades);
		System.out.println(allGrades);
		
		Collections.reverse(allGrades);
		System.out.println(allGrades);

	}

}
