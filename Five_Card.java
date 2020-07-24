
/**
 * <b>Five Card is a sub-class of Card</b>
 * <p>
 * Instance of a 5 card
 * 
 * @author Sage Garcia
 */
public class Five_Card extends Card{

    /**
     * Constructor of Five Card
     * @param suit Sets value of suit
     */
    public Five_Card(Card.Suit suit){
        super(5, 5, suit);
    }
    
    /**
     * @return string val of card
     */
    public String Display(){
        return "5 of ";
    }
}