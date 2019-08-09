package comp1406a5;

public class SmallGoldTester{

  public static void main(String[] args){

    World world = new World(4,5);
    // fill the world with empty locations (not a wall, no gold, not start)
    for(int r=0; r<4; r+=1){
      for(int c=0; c<5; c+=1){
        world.locations[r][c] = new MyLocation(r,c,0);
      }
    }
    // add some walls
    world.locations[0][2].setWall();
    world.locations[1][2].setWall();

    // add some gold
    int row = (int)(Math.random()*2)+2;
    int col = (int)(Math.random()*2)+2;
    int gold = (int)(Math.random()*10)+2;
    world.locations[row][col] = new MyLocation(2,4,gold);
    // set the start
    world.locations[0][0].setStart();
    world.setStart(0,0);

    // show the world
    System.out.println(world);

    // look for gold
    int foundGold = Gold.findGold(world);
    System.out.print("gold found is " + foundGold);
    System.out.println("  [gold expected is " + gold + "]");

    // compute perimeter
    int perimeter = Gold.computePerimeter(world);
    System.out.print("perimeter found is " + perimeter);
    System.out.println("  [gold expected is 5]");

  }


}
