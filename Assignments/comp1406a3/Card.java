package comp1406a3;

public class Card{

 /*
  *
  * Add attributes here to store a Card object's state
  *
 */

 /** Create a card specified suit and rank.
  * <p>
	* When creating a Joker card any valid rank can be used.
	* A Joker does not have rank.
  *
  * @param rank is the rank of the card
  * @param suit is the suit of the card
  */
  public Card(Rank rank,Suit suit){
  }



	/** Getter for this card's rank */
  public Rank getRank(){return null;}

	/** Getter for this card's suit */
  public Suit getSuit(){return null;}



  /** The numerical representation of the rank of the current card
   * <p>
   *  A card's numerical rank is as follows:
   *  TWO is 2, THREE is 3, ..., TEN is 10,
   *  Jack is 11, Queen is 12, King is 13, ACE is 14,
   *  Joker does not have a rank. This method is undefined for this card
   *  and can return any valid integer.
   *
   *  @return the numerical rank of this card
   */
  public int getRankValue(){return -1;}



  /** String representation of a Card object.
  DO NOT CHANGE THIS!
  Some grading will be done based on the output of this
  method. Changing this method may result in you receiving
  zero marks from the server.
  **/
  @Override
  public final String toString(){
	// outputs a string representation of a card object
	if( this.getSuit() == Suit.JOKER ){
		return Suit.JOKER.name();
	}
    	return this.getRank().name() + ":" + this.getSuit().name();
  }
}
