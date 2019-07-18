package comp1406a2;

public class Lock{

	// ADD ATTRIBUTES HERE

	
	/** Create a lock for the specified box
	 * <p>
	 * The lock must be initially locked (closed) when created.
	 * The lock must be given a UNIQUE ID value when created.
	 *
	 * @param box is a Box that will have this lock to keep is shut.
	 */
	public Lock(Box box){}

	/** Retrieve the key for this lock.
	 * <p>
	 * This method can be called multiple times but is only allowed to
	 * return its mathcing key the first time it is called. Every time
	 * after the mehtod will return null.
	 *
	 * @return the key that matches this lock (i.e., the key that can unlock it)
	 *         if it is the first time called. Returns null otherwise.
	 */
	public Key getKey(){return null;}


  	/** Check if this lock is locked or not.
	 *
	 * @return true if this lock is locked and false otherwise.
	 */
  	public boolean isLocked(){ return false;}

  	/** Locks this lock (regardless if it was already locked or not). */
	public void lock(){}

  	/** Unlocks the lock if the input key matches the lock.
	 * <p>
	 * If this lock is already unlocked this method will return true and
	 * do nothing else. 
	 * If this lock is locked and input key matches this lock, then it
	 * unlocks the lock and returns true.
	 * If this lock is locked and the input key does not match this lock,
	 * then returns false and does nothing else.
	 *
	 * @param key is key.
	 * @return true if the lock was already unlocked OR if the key matches the
	 *         lock. Returns false otherwise.
	 */
	public boolean unlock(Key key){return false;}

  	/** retrieves the ID of the lock
	 *
	 * @return the ID of this lock.
	 */
	public int getID(){return -1;}


}
