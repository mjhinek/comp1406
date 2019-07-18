package comp1406a2;

/** A Secret object has a secret (string) and a unique identifier (count) */
public class Secret{
	protected static int counter = 0;

  /** The secret */
	protected String secret;

	/** A count for this Secret object (A unique identifier) */
	protected int count;

  /** Creates a secret with the given input
	 *  <p>
	 * When created, a secret is also given a count that is
	 * unique. The count allows us to differentiate two secrets with
	 * the same string.
	 *
	 * @param secret is the secret for this Secret
	 */
	public Secret(String secret){
		this.secret = secret;
		this.count = counter;
		counter += 1;
	}

	/** getter for the secret string
	 * @return this Secret's secret (string)
	 */
	public String getSecret(){ return this.secret;}

	/** getter for the secret count
	 * @return this secret's count
	 */
	 	public int getCount(){ return this.count;}


	@Override
	public boolean equals(Object o){
		if( o == null){  // should not need this check...
			return false;  // will include to avoid any crashed
		}

		// if o is a Secret object then
		// check if both secret string and count match this Secret's
		if( o instanceof Secret){
			Secret s = (Secret)o;
			return this.secret.equals(s.secret) && this.count == s.count;
		}

		// if o is not a Secret then return false
		return false;

	}

 
}
