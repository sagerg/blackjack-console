
/**
 * <b>Two Card is a sub-class of Card</b>
 * <p>
 * Instance of a 2 card
 * 
 * @author Sage Garcia
 */
public class Two_Card extends Card{

    /**
     * Constructor of Two Card
     * @param suit Sets value of suit
     */
    public Two_Card(Card.Suit suit){
        super(2, 2, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "2 of ";
    }
}