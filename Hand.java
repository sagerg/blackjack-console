import java.util.ArrayList;

/**
 * <b>Hand class simulates players' cards during a blackjack game</b>
 * <p>
 * Uses arraylists to store all instances of Cards to players' hands
 * 
 * @author Sage Garcia
 */
public class Hand{

    /**
     * Private list to act as a player's hand in game
     */
    private ArrayList<Card> hand;

    /**
     * Constructor for Hand class
     * <p>
     * Instantiates hand as a list of type Card
     */
    public Hand(){
        hand = new ArrayList<Card>();
    }

    /**
     * Adds card to player's hand [list]
     * @param card Object Card to be added to list
     */
    public void takeCard(Card card){
        hand.add(card);
    }

    /**
     * Sums values of cards in player's hand
     * If sum is > 21, sum up alt values of cards
     * @return sum of values in a hand
     */
    public int calculateValue(){
        int sum = 0;
        for(Card card : hand){
            sum += card.getVal();
        }
        if(sum > 21){
            sum = 0;
            for(Card card : hand){
                sum += card.getAltVal();
            }
        }
        return sum;
    }

    /**
     * Concatenate card and their suits's str name
     * @return string representation of a card
     */
    public String displayHand(){
        String allCards = "";

        for(Card card : hand){
            allCards += card.Display() + card.getSuit() + ", ";
        }

        return allCards;
    }

    /**
     * Get last elem in list
     * @return last elem of a list as a string
     */
    public String getLastCard(){
        Card last = hand.get(hand.size() - 1);
        return last.Display() + last.getSuit();
    }
}