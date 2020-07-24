
/**
 * <b>King Card is a sub-class of Card</b>
 * <p>
 * Instance of a king
 * 
 * @author Sage Garcia
 */
public class King_Card extends Card{

    /**
     * Constructor of King Card
     * @param suit Sets value of suit
     */
    public King_Card(Card.Suit suit){
        super(10, 10, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "King of ";
    }
}