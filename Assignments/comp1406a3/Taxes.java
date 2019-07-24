package comp1406a3;

/** Abstract class that represents a tax return filing for some person. */
public abstract class Taxes{
  /** Name of person */
  protected String name;  
	
	/** social insurance number of person */
	protected int    sin;  

	/** Constructor to set name and sin number 
	 * @param name is the name of the person
	 * @param sin is the social insurance number of the person
	 */
	public Taxes(String name, int sin){
		this.name = name;
		this.sin = sin;
	}

	/** Returns the amount of taxes owed
	 * 
	 * @return the amount of taxes owed rounded to the 
	 * nearest dollar. This might be negative. Rounding 
	 * should only happen after all other computations 
	 * are done. Round to the closest dollar.
	 */
	public abstract long taxesOwed();

}
