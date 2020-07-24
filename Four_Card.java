
/**
 * <b>Four card is a sub-class of Card</b>
 * <p>
 * Instance of a 4 card
 * 
 * @author Sage Garcia
 */
public class Four_Card extends Card{

    /**
     * Constructor of Four Card
     * @param suit Sets value of suit
     */
    public Four_Card(Card.Suit suit){
        super(4, 4, suit);
    }

    /**
     * @return string val of card
     */
    public String Display(){
        return "4 of ";
    }
}