
/**
 * <b>Jack Card is a sub-class of Card</b>
 * <p>
 * Instance of a jack
 * 
 * @author Sage Garcia
 */
public class Jack_Card extends Card{

    /**
     * Constructor of Jack Card
     * @param suit Sets value of suit
     */
    public Jack_Card(Card.Suit suit){
        super(10, 10, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "Jack of ";
    }
}