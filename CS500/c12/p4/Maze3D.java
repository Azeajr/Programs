import java.util.Random;

public class Maze3D{
	private final int TRIED = 3;
	private final int PATH = 7;
	
	private int[][][] grid={
		{{1,0,0}, {0,0,0}, {0,0,0}},
		{{1,0,1}, {0,0,1}, {0,0,1}},
		{{0,0,0}, {0,0,0}, {0,0,1}}
	};
	
	public Maze3D(){
		Random gen = new Random();
		
		for(int x=0;x<grid.length;x++){
			for(int y=0;y<grid[x].length;y++){
				for(int z=0;z<grid[x][y].length;z++){
					grid[x][y][z]=gen.nextInt(2);
				}
			}
		}
		
	}
	
	
	
	public boolean traverse (int x, int y, int z){
		boolean done = false;

		if (valid (x, y, z)){
			grid[x][y][z] = TRIED;  // this cell has been tried

			if (x == grid.length-1 && y == grid[0].length-1 && z == grid[0][0].length-1){
				done = true;  // the maze is solved
			}else{
				done =     traverse (x+1, y, z);     // down
				if (!done){
					done = traverse (x, y+1, z);  // right
				}
				if (!done){
					done = traverse (x, y, z+1);  // forward
				}
				if (!done){
					done = traverse (x-1, y, z);  // up
				}
				if (!done){
					done = traverse (x, y-1, z);  // left
				}
				if (!done){
					done = traverse (x, y, z-1);  // backward
				}
			}
		
			if (done){  // this location is part of the final path
				grid[x][y][z] = PATH;
			}
		}
		
		return done;
   }
	
	
	
	//-----------------------------------------------------------------
	//  Determines if a specific location is valid.
	//-----------------------------------------------------------------
	private boolean valid (int x, int y, int z){
		boolean result = false;

		// check if cell is in the bounds of the matrix
		if (x >= 0 && x < grid.length &&
			y >= 0 && y < grid[x].length &&
			z >= 0 && z < grid[x][y].length)

			//  check if cell is not blocked and not previously tried
			if (grid[x][y][z] == 1)
				result = true;

		return result;
	}
	
	public String toString(){
		String result = "\n";
		for(int x=0;x<grid.length;x++){
			for(int y=0;y<grid[x].length;y++){
				for(int z=0;z<grid[x][y].length;z++){
					result += grid[x][y][z] + "";
				}
				result += "\n";
			}
			result += "\n";
		}
		return result;
	}
	
}