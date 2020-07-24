import java.util.Collections;
import java.util.ArrayList;

/**
 * <b>Deck class simulates a deck of 52 cards</b>
 * <p>
 * Demonstrates shuffle method: randomizes a list
 * 
 * @author Sage Garcia
 */
public class Deck{

    /**
     * Deck and suit declared as private array lists to be used to house cards created
     */
    private ArrayList<Card> deck;
    private ArrayList<Card.Suit> suitArr;

    /**
     * Constructor for Deck obj
     */
    public Deck(){

        // Create an empty deck
        deck = new ArrayList<Card>();

        // Temp store all suits in list
        // Has 4 enums
        suitArr = new ArrayList<Card.Suit>();
        suitArr.add(Card.Suit.HEART);
        suitArr.add(Card.Suit.CLUB);
        suitArr.add(Card.Suit.SPADE);
        suitArr.add(Card.Suit.DIAMOND);

        // Creates 13 Card objs
        // 13 x 4 suits = 52 cards in total
        // Add to deck all Card objs made
        for (Card.Suit i : suitArr){
            deck.add(new Two_Card(i));
            deck.add(new Three_Card(i));
            deck.add(new Four_Card(i));
            deck.add(new Five_Card(i));
            deck.add(new Six_Card(i));
            deck.add(new Seven_Card(i));
            deck.add(new Eight_Card(i));
            deck.add(new Nine_Card(i));
            deck.add(new Ten_Card(i));
            deck.add(new Jack_Card(i));
            deck.add(new Queen_Card(i));
            deck.add(new King_Card(i));
            deck.add(new Ace_Card(i));
        }
    }

    /**
     * Calls shuffledeck
     * @return [and removes] first elem in list deck
     */
    public Card dealCard(){ 
        shuffleDeck(); 
        Card c = deck.get(0);

        // Remove first elem in list
        deck.remove(0);
        return c;
    }

    /**
     * Short Desc: Shuffles deck arraylist
     * <p>
     * <b>
     * Brief Introduction to the Collections.shuffle method:
     * </b>
     * <p>
     * The shuffle method randomizes the order of the list elements, the list invoked as an argument in the method call
     * 
     * @see <a href=https://www.javatpoint.com/java-collections-shuffle-method>Quick Overview (External Link)</a>
     */
    public void shuffleDeck(){ Collections.shuffle(deck); }
}