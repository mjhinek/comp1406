package comp1406t4;

/*
 * A class to model currency (money) as dollars and cents
 */

public class Money{

  /* attributes */
  protected int dollars = -1;
  protected int cents = -1;

	protected String name;

  public Money(String name){
		// create an object with zero dollars and cents.
		this.name = name;
  }

  public Money(String name, int c){
		// create an object with c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
		this.name = name;
  }

  public Money(String name, int d, int c){
		// create an object with d dollars and c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
		this.name = name;
  }

  public Money(String name, int[] coins){
	  // input array has 6 elements and corresponds to
		// {#toonies, #loonies, #quarters, #dimes, #nickels, #pennies}
    // {$2, $1, $0.25, $0.10, $0.05, $0.01}
		// create an object with total money passed in array
		// (adjusting internal dollars and cents so that 0<=cents<=99)
		this.name = name;
  }


	/** getter for name */
	public String getName(){ return this.name; }
	
	/** setter for name */
	public Money setName(String name){
		this.name = name;
		return this;
	}
	
  /**
   * Returns a String representation of the value of the current object.
   * needed).
   **/
	@Override
	 public String toString(){
    return this.name + ": $" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
  }

}
