import java.util.LinkedList;

public class MazeSolver {
	
	static int[][] maze = {
			{2,0,1,1},
			{1,1,0,1},
			{0,1,1,1}
	};
	//0 = wall
	//1 = path
	//2 = destination
	
	static LinkedList<position> path = new LinkedList<position>();
	
	public static void main(String[] args) {
		position p = new position(0,3);
		path.push(p);
		
		maze[path.peek().x][path.peek().y] = 0;
		
	}

}
