
/**
 * <b>Seven Card is a sub-class of Card</b>
 * <p>
 * Instance of a 7 card
 * 
 * @author Sage Garcia
 */
public class Seven_Card extends Card{

    /**
     * Constructor of Seven Card
     * @param suit Sets value of suit
     */
    public Seven_Card(Card.Suit suit){
        super(7, 7, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "7 of ";
    }
}