
/**
 * <b>Three Card is a sub-class of Card</b>
 * <p>
 * Instance of a 3 card
 * 
 * @author Sage Garcia
 */
public class Three_Card extends Card{

    /**
     * Constructor of Three Card
     * @param suit Sets value of suit
     */
    public Three_Card(Card.Suit suit){
        super(3, 3, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "3 of ";
    }
}