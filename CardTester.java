/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("king", "hearts", 13);
		Card card2 = new Card("queen", "hearts", 12);
		Card card3 = new Card("ace", "spades", 1);
		Card card4 = new Card("king", "hearts", 13);
		System.out.println("Card1 is a " + card1.toString());
		System.out.println("Card2 is a " + card2.toString());
		System.out.println("Card3 is a " + card3.toString());
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card4));
	}
}
