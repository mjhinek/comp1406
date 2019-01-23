package comp1406t3;

/*
 * A class to model currency (money) as dollars and cents
 */

public class Money{

  /* attributes */
  private int dollars = -1;
  private int cents = -1;


  public Money(){
		// create an object with zero dollars and cents.
  }

  public Money(int c){
		// create an object with c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
  }

  public Money(int d, int c){
		// create an object with d dollars and c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
  }

  public Money(int[] coins){
	  // input array has 6 elements and corresponds to
		// {#toonies, #loonies, #quarters, #dimes, #nickels, #pennies}
    // {$2, $1, $0.25, $0.10, $0.05, $0.01}		
		// create an object with total money passed in array
		// (adjusting internal dollars and cents so that 0<=cents<=99)
  }


  /**
   * Returns a String representation of the value of the current object.
   *
   * @return The value of the current object is returned as the <code>String</code>"$D.cc"
   * where D is the number of dollars and cc is the cents of the value.  Uses the <code>format()</code>
   * method from the <code>String</code> class to ensure that the cents are displayed properly (2 spaces
   * with leading zeros if needed).
   **/
  public String toString(){
    return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
  }

}
