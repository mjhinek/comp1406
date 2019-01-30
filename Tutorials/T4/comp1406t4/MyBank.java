package comp1406t4;

import java.util.Arrays;

/** holds all of my money */
public class MyBank{
	
	/** max number of money objects my bank can hold */
	public static final int MAX_SIZE = 100;
	
	protected Money[] money = new Money[MAX_SIZE];
	protected int     size = 0; // how many money objects being stored
	
	/** create empty bank */
	public MyBank(){}
  
	public MyBank addMoney(Money m){
		// adds money to this my money
		// don't forget to update size!
		return this;  // do not change this
	}
	
	public Money removeMoney(Money m){
		// if m is in this object, remove and return it.
		// otherwise, return null.
		// Don't forget to update size!
		return null;
	}

	public int getSize(){ return this.size; }
	
	public void filter(Money low, Money high){
		// prints to the standard output stream (screen)
		// the name of all money in this object whose
    // value is greater than low and less than high.
		// Example: filter( new Money("low", 99), new Money("high", 200))	
    // will print all the name of all money objects in this 
		// that has value greater than $0.99 and less than $2.00. 		
	}
	
	@Override
	 public String toString(){
    return Arrays.toString(this.money);
  }

}
