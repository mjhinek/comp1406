package comp1406a5;

public class Helper{

	/** Generate a random Image that is rows X cols large, where each
		* location has ink with the given probability.
		*
		* @param rows is the number of rows in the image
		* @param cols is the number of columns in the image
		* @param probWall is the probability that the any location in the world is a wall
		* @param probWall is the probability that the any location that is not a wall will have gold
		* @return a world rows X cols large where each location has
		*		      a wall with given probability. If the location is not a wall, it will have
		*         gold with probability probGold
		*/
	public static World makeRandomWorld(int rows, int cols,
	                                    double probWall, double probGold){
		World world = new World(rows, cols);
		for(int row=0; row<rows; row+=1){
			for(int col=0; col<cols; col+=1){
				boolean wall = Math.random() < probWall;
				if(wall){
					world.locations[row][col] = new MyLocation(row, col);
				}else{
					world.locations[row][col] = new MyLocation(row, col, Math.random()<probGold ? 10 : 0 );
				}
			}
		}
		for(int row=0; row<rows; row+=1){
			for(int col=0; col<cols; col+=1){
				if( !world.locations[row][col].isWall() && world.locations[row][col].getGold() == 0 ){
					world.setStart(row,col);
					return world;
				}
			}
		}
		// if we get this far the world generator failed to find a place to put the start location
		// either try a bigger world or make the probability of gold closer to 0.0
		return null;
	}



}
