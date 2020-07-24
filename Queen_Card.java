
/**
 * <b>Queen Card is a sub-class of Card</b>
 * <p>
 * Instance of a queen
 * 
 * @author Sage Garcia
 */
public class Queen_Card extends Card{

    /**
     * Constructor of Queen Card
     * @param suit Sets value of suit
     */
    public Queen_Card(Card.Suit suit){
        super(10, 10, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "Queen of ";
    }
}