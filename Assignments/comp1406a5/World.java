package comp1406a5;

public class World{

	protected Location[][] locations;
	protected int rows;
	protected int cols;
	protected Location start;

	public World(int rows, int cols){
		this.locations = new Location[rows][cols];
		this.rows = rows;
		this.cols = cols;
	}

	public Location getLocation(int row, int col){
		return this.locations[row][col];
	}

	public World setStart(int row, int column){
		locations[row][column].setStart();
		return this;
	}


  /** Clear all locations in the world; setting all settable state to 'zero' */
  public void clearWorld(){
		for(int row=0; row<this.rows; row+=1){
			for(int col=0; col<this.cols; col+=1){
				getLocation(row,col).clear();
			}
		}
	}





	public static final String WALL = "#";     // "\u2588";
	public static final String EMPTY = " ";    //
  public static final String GOLD = "g";     // gold
	public static final String START = "s";    // start
	@Override
	public String toString(){
		String world = "+";
		for(int c=0; c<cols; c+=1){
			world += "-";
		}
		world += "+\n";
		for(int r=0; r<rows; r+=1){
			world += "|";
			for(int c=0; c<cols; c+=1){
				Location room = getLocation(r,c);
				if( room.isWall() ) world += WALL;
				else if( room.isStart()) world += START;
				else if( room.getGold() > 0 ) world += GOLD;
				else world += EMPTY;
				//	world += getLocation(r,c).isWall() ? WALL : (getLocation(r,c).getGold() > 0 ? GOLD : EMPTY);
			}
			world += "|\n";
		}
		world += "+";
		for(int c=0; c<cols; c+=1){
			world += "-";
		}
		world += "+";

		return world;
	}



}
