import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class MazeSolver {
		
	//0 = wall
	//1 = path
	//2 = destination
		
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Maze> mazes = readMazes();
				
		
		int i = 0;
		while(i<mazes.size()) {
			if(solveMaze(mazes.get(i))) {
				System.out.println("You Won!");
			}else {
				System.out.println("No Path!");
			}
			
			i++;
		}
				
	}
	
	private static ArrayList<Maze> readMazes() throws FileNotFoundException {
		ArrayList<Maze> mazes = new ArrayList<Maze>();

		//fill list from file
		Scanner in = new Scanner(new File("mazes.txt"));
		while(in.hasNext()) {			
			Maze m = new Maze();
			// number of rows is stored in the first line in the file
			int rows = Integer.parseInt(in.nextLine());
			m.maze = new int[rows][];
			
			//String items[] = in.nextLine().split(",");
			
			// Iterate and for each one, get a new line and split it
			for(int i = 0;i<rows;i++) {
				String line = in.nextLine();
				m.maze[i] = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
			}
			
			m.start = new position(Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
			
			in.nextLine(); //toss the extra space
			mazes.add(m);

		}
		in.close();
		
		
		return mazes;
		
	}

	private static boolean solveMaze(Maze m) {
		// TODO Auto-generated method stub
		position p = m.start;
		m.path.push(p);
		
		
		while(true) {
			int x = m.path.peek().x;
			int y = m.path.peek().y;
			m.maze[x][y] = 0;
			
			//down			
			if(isValid(x+1,y, m)){
				if(m.maze[x+1][y] == 2) {
					System.out.println("Moved down");
					return true;
				}else if(m.maze[x+1][y] == 1){
					m.path.push(new position(x+1,y));
					System.out.println("Moved down");
					continue;
				}

			}

			
			//left
			if(isValid(x,y-1, m)) {
				if(m.maze[x][y-1] == 2) {
					System.out.println("Moved left");
					return true;
				}else if(m.maze[x][y-1] == 1){
					m.path.push(new position(x,y-1));
					System.out.println("Moved left");
					continue;
				}

			}

			//up
			if(isValid(x-1,y, m)) {
				if(m.maze[x-1][y] == 2) {
					System.out.println("Moved up");
					return true;
				}else if(m.maze[x-1][y] == 1){
					m.path.push(new position(x-1,y));
					System.out.println("Moved up");
					continue;
				}

			}

			//right
			if(isValid(x,y+1, m)) {
				if(m.maze[x][y+1] == 2) {
					System.out.println("Moved right");
					return true;
				}else if(m.maze[x][y+1] == 1){
					m.path.push(new position(x,y+1));
					System.out.println("Moved right");
					continue;
				}

			}
			
			m.path.pop();
			System.out.println("Moved back!");
			if(m.path.size() <= 0) {
				return false;
			}

		}

	}

	public static boolean isValid(int x, int y, Maze m) {
		if(x < 0 || x >= m.maze.length || y < 0 || y >= m.maze[x].length) {
			return false;
		}
		return true;
	}

}
