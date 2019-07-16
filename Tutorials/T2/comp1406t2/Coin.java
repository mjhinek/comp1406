package comp1406t2;

/**
 Coin class for Assignment 2
 <p>
 A Coin object models a coin that we will flip (heads or tails)
 */
public class Coin{

  /** A constant referece for "Heads" */
  public static final String HEADS = "Heads";

  /** A constant reference for "Tails" */
  public static final String TAILS = "Tails";

  /** Creates an unbiased coin.
   * <p>
   * When flipped, this coin will be equally likely to be Heads or Tails.
   */
  public Coin(){}

  /** Creates a biased coin.
   * <p>
   * When flipped, this coin will be Heads with some probability p (specified as input) and
   * Tails with 1-p.
   *
   * @param p is the bias probability. This coin, when flipped,  will
   *        be Heads with probability p and Tails with probability 1-p.
   */
  public Coin(double p){}

  /** Flips this coin.
   *
   * @return returns either HEADS or TAILS (the two constants defined in this class).
   * @see #HEADS
   * @see #TAILS
   */
  public String flip(){
    return "None";
  }


  /** A count of how many times this coin has been flipped.
   *
   * @return the number of times this coin has been flipped.
   */
  public int numberOfFlips(){
    return -1;
  }


  /** A history of the last 10 flips of this coin.
   * <p>
   * The order of the history corresponds to the order of the
   * flips in reverse. The last flip outcome (HEADS or TAILS) will
   * be the first element in the history.
   * The size of the history (output array) will be 10 unless there
   * has been less than 10 flips of this coin in which the size will be
   * the same as the number of flips. The array will ONLY contain
   * references to the two constants HEADS or TAILS.
   *
   * @return A list (array) of the last 10 flips of this coin.
   */
  public String[] history(){
    return null;
  }

}
