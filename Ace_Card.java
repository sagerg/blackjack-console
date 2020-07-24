
/**
 * <b>Ace Card is a sub-class of Card</b>
 * <p>
 * Instance of an ace
 * 
 * @author Sage Garcia
 */
public class Ace_Card extends Card{

    /**
     * Constructor of Ace Card
     * @param suit Sets value of suit
     */
    public Ace_Card(Card.Suit suit){
        super(11, 1, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "Ace of ";
    }
}