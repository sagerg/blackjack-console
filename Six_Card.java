
/**
 * <b>Six Card is a sub-class of Card</b>
 * <p>
 * Instance of a 6 card
 * 
 * @author Sage Garcia
 */
public class Six_Card extends Card{

    /**
     * Constructor of Six Card
     * @param suit Sets value of suit
     */
    public Six_Card(Card.Suit suit){
        super(6, 6, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "6 of ";
    }
}