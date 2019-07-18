package comp1406a2;

/** A Proof object is meant to given evidence (proof) that you know
 * the secret of a given box. */
public class Proof{
	/** the secret in the box */
	protected Secret secret;

	/** the box */
	protected Box box;

	/** the key for the lock on the box */
	protected Key key;

  /** Creates a proof object
	 * @param secret is the secret
	 * @param box is the box
	 * @param key is the key
	 */
	public Proof(Secret secret, Box box, Key key){
		this.secret = secret;
		this.box = box;
		this.key = key;
	}

  /** Getter for the secret
	 * @return the secret in the proof
	 */
	public Secret getSecret(){return this.secret;}

	/** Getter for the box
	 * @ @return the box in the proof
	 */
	public Box getBox(){return this.box;}

  /** Getter for the key
	 * @return the key in the proof
	 */
	public Key getKey(){return this.key;}

  /** Verifies the proof
	 *
	 * @return true if the key open the box and the secret inside the box
	 *        is the same as the proof secret. Returns false otherwise.
	 */
	public boolean verify(){
		Secret s = box.unlock(key).getSecret();
		return this.secret.equals(s);

	}
}
