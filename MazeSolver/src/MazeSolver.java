import java.util.LinkedList;

public class MazeSolver {
	
	static int[][] maze = {
			{1,0,0,1},
			{1,0,1,1},
			{0,1,1,1}
	};
	//0 = wall
	//1 = path
	//2 = destination
	
	static LinkedList<position> path = new LinkedList<position>();
	
	public static void main(String[] args) {
		position p = new position(0,3);
		path.push(p);
		
		
		while(true) {
			int x = path.peek().x;
			int y = path.peek().y;
			maze[x][y] = 0;
			
			//down			
			if(isValid(x+1,y)){
				if(maze[x+1][y] == 2) {
					System.out.println("You won");
					return;
				}else if(maze[x+1][y] == 1){
					path.push(new position(x+1,y));
					System.out.println("Moved down");
					continue;
				}

			}

			
			//left
			if(isValid(x,y-1)) {
				if(maze[x][y-1] == 2) {
					System.out.println("You won");
					return;
				}else if(maze[x][y-1] == 1){
					path.push(new position(x,y-1));
					System.out.println("Moved left");
					continue;
				}

			}

			//up
			if(isValid(x-1,y)) {
				if(maze[x-1][y] == 2) {
					System.out.println("You won");
					return;
				}else if(maze[x-1][y] == 1){
					path.push(new position(x-1,y));
					System.out.println("Moved up");
					continue;
				}

			}

			//right
			if(isValid(x,y+1)) {
				if(maze[x][y+1] == 2) {
					System.out.println("You won");
					return;
				}else if(maze[x][y+1] == 1){
					path.push(new position(x,y+1));
					System.out.println("Moved right");
					continue;
				}

			}
			
			path.pop();
			System.out.println("Moved back!");
			if(path.size() <= 0) {
				System.out.println("No path");
				return;
			}

		}
		
		//maze[path.peek().x][path.peek().y] = 0;
		
	}
	
	public static boolean isValid(int x, int y) {
		if(x < 0 || x >= maze.length || y < 0 || y >= maze[x].length) {
			return false;
		}
		return true;
	}

}
