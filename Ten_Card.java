
/**
 * <b>Ten Card is a sub-class of Card</b>
 * <p>
 * Instance of a 10 card
 * 
 * @author Sage Garcia
 */
public class Ten_Card extends Card{

    /**
     * Constructor of Ten Card
     * @param suit Sets value of suit
     */
    public Ten_Card(Card.Suit suit){
        super(10, 10, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "10 of ";
    }
}