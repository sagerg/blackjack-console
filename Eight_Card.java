
/**
 * <b>Eight Card is a sub-class of Card</b>
 * <p>
 * Instance of a 8 card
 * 
 * @author Sage Garcia
 */
public class Eight_Card extends Card{

    /**
     * Constructor of Eight Card
     * @param suit Sets value of suit
     */
    public Eight_Card(Card.Suit suit){
        super(8, 8, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "8 of ";
    }
}