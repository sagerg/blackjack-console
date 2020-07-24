
/**
 * <b>Nine Card is a sub-class of Card</b>
 * <p>
 * Instance of a 9 card
 * 
 * @author Sage Garcia
 */
public class Nine_Card extends Card{

    /**
     * Constructor of Nine Card
     * @param suit Sets value of suit
     */
    public Nine_Card(Card.Suit suit){
        super(9, 9, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "9 of ";
    }
}