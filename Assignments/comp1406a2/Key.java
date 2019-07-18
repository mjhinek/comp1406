package comp1406a2;

import java.util.HashSet;
public class Key{

	/** A set that keeps all Lock IDs for every key created.
	 * <p>
	 * This is used to try and help prevent a key being created on the
	 * fly when a lock is encountered. Whenever a key is created, it is
	 * linked to the lock it matches. Only ONE key should every be created
	 * for any given lock.
	 */
	protected static HashSet<Integer> hs = new HashSet<Integer>();

	/** The lock that this key matches */
	protected final Lock lock;

  /** Creates a key for a given lock. This key will unlock the given lock.
	 * <p>
	 * If a key was already generated with the input lock, this key will
	 * be 'invalid'. That is, it will not be able to unlock any lock.
	 *
	 * @param lock is the lock that this key will be matched with
	 *        (provided no other key already matches this lock)
	 */
	public Key(Lock lock){
		if( !hs.contains(lock.getID()) ){
			hs.add(lock.getID());
			this.lock = lock;
		}else{
			this.lock = null;
		}
	}


  /** Check is the key is invalid (cannot open any lock) or not.
	 *
	 * @return true if this lock is matched with a lock
	 *   (and is can open the lock), returns false if this lock is unable to
	 *   open any lock.
	 */
	public boolean invalid(){
		return lock == null;
	}

  /** Retrieves the ID for the lock that this key is matched with.
	 * <p>
	 * Read the code if you want to see the ternary operator in action!
	 *
	 * @return the ID for the lock that this key is matched with (can unlock),
	 *      and returns -1 if this key is invalid (is not matched with a lock).
	 */
	public int lockID(){
		// Oh my! The ternary operator in action.
		return invalid() ? -1 : this.lock.getID();


		// this is equivalent to
		//
		//  if(invalid){
		//     return -1;
    //  }else{
		//     return this.lock,getID();
		//  }

	}

}
