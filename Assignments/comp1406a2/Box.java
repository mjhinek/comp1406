package comp1406a2;

/** A box holds a secret (and maybe a key). You can read the secret if
 * the box is open. Otherwise, you'll need the right key to open it.
 */
 public class Box{

	// ADD ATTRIBUTES HERE

	 
	 /** Creates a Box object containing the specified secret with the specified lock.
	 *
	 * @param secret is the secret the box will holds
	 * @param lock is the lock for the box
	 */
	public Box(Secret secret, Lock lock){}

	/** Checks if the box is opened (unlocked) or closed (locked)
	 *
	 * @return true if the box is open (unlocked) and false otherwise.
	 */
	public boolean isOpen(){return false;}
	 
	 
	 /** Open this box's lock with the given key (if it matches the lock)
	  * <p>
   	  * An already open box will remain open regardless of input key.
	  * A closed box can only be opened if the key matches the lock.
	  * Examples:
	  *      box b is unlocked, key k does not match the lock of b
	  *           b.open(k);
	  *           b.isOpen() --> true
	  *      box b is locked, key k matches the lock of b
	  *           b.open(k);
	  *           b.isOpen() --> true
	  *      box b is locked, key k does not match the lock of b
	  *           b.open(k);
	  *           b.isOpen() --> false
	  *
	  * @param key is a key
	  * @param this box (for method chaining purposes).
	  */
	public Box open(Key key){return this;}

	/** Locks the lock on this box. */
  	public void lock(){}

	/** Retrieves the secret in this box if it is open.
	 *
	 * @return the secret inside this box is this box is open (unlocked),
	 *          and returns null otherwise.
	 */
	public Secret getSecret(){return null;}


  	/** Retrives the lock on this box.
	 *
	 * @return the lock of this box (if the box is open or not).
	 */
	public Lock getLock(){return null;}


  	/** Puts a key in this box
	 *
	 * @param key is a key (that will be added in this box)
	 * @return this box (for method chaining purposes).
	 */
	public Box addKey(Key key){}


  	/** Checks if this box has a key inside it (when the box is open)
	 *
	 * @return true if this box is open (unlocked) AND it does have a key inside,
	 *         returns false otherwise.
	 */
	public boolean hasKey(){return false;}


	/** Retrieves the key inside this box
	 * (if the box is open and it has a key inside)
	 *
	 * @return the key inside this box if this box is open (unlocked) and
	 *         has a key inside it. Returns null otherwise.
	 */
	public Key getGet(){return null;}

}
