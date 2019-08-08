package comp1406a5;

public class Location{
	protected int     row;     // row of Location
	protected int     col;     // column of Location

	protected int     gold;    // amount of gold in this location
	protected boolean wall;    // true of this Location is a wall
	protected boolean start;   // starting location in world

	public Location(int row, int col){ // makes a wall
		this.row = row;
		this.col = col;
		this.wall = true;
		this.gold = 0;
		this.start = false;
	}
	public Location(int row, int col, int gold){// not a wall
		this.row = row;
		this.col = col;
		this.wall = false;
		this.gold = gold;
		this.start = false;
	}

	public Location setStart(){ this.start = true; this.wall = false; this.gold = 0; return this;}
  public Location setWall(){ this.wall = true; this.gold = 0; this.start = false; return this;}

	public int getRow(){ return this.row; }
	public int getCol(){ return this.col; }
	public boolean isWall(){ return this.wall; }
	public int getGold(){ return this.gold; }
	public boolean isStart(){ return this.start; }


  /** Clear all settable state of this Location; set everythibg to 'zero' */
  public void clear(){
		this.gold = 0;

	}
}
