import java.util.ArrayList;
import java.util.LinkedList;

public class MazeSolver {
		
	//0 = wall
	//1 = path
	//2 = destination
		
	public static void main(String[] args) {
		
		ArrayList<Maze> mazes = new ArrayList<Maze>();

		Maze m = new Maze();
		
		int[][] maze = {
			{1,0,0,1},
			{1,0,1,1},
			{0,1,1,2}
		};
		m.maze = maze;
		m.start = new position(0,3);
		m.path = new LinkedList<position>();

		Maze n = new Maze();
		
		int[][] n_maze = {
			{1,0,0,1},
			{1,0,1,1},
			{0,1,1,2}
		};
		n.maze = n_maze;
		n.start = new position(0,3);
		n.path = new LinkedList<position>();

		mazes.add(m);
		mazes.add(n);
		
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
