/**
 * <b>Card obj is abstract and is a super class for all other card classes</b>
 * <p>
 * Simulates a general playing card without any attributes
 * 
 * @author Sage Garcia
 */
public abstract class Card{
    
    /**
     * val contains primary value of sub-class card
     * altval contains secondary value of sub-class card
     * suit contains enum value of cards
     */
    private int val;
    private int altval;
    private Suit suit;

    /**
     * <b>Enum Suit has final variables HEART, CLUB, SPADE, and DIAMOND</b>
     * <p>
     * String rep used throughout the program to indicate type of card
     */
    enum Suit{
        HEART("Hearts"), 
        CLUB("Clubs"), 
        SPADE("Spades"), 
        DIAMOND("Diamonds");

        // Contains string rep of Suit obj
        private String strsuit;
        
        /**
         * Constructor for type of Suits in enum
         * @param suit Sets strsuit's val
         */
        Suit(String suit){
            this.strsuit = suit;
        }

        /**
         * Get method for Suit
         * @return String val of Enum Suit
         */
        public String getStr(){
            return strsuit;
        }
    }

    /**
     * Constructor for Card obj
     * @param val    Sets val's value
     * @param altval Sets altval's value
     * @param suit   Sets suit's value
     */
    public Card(int val, int altval, Suit suit){
        this.val = val;
        this.altval = altval;
        this.suit = suit;
    }

    /**
     * Get method for str rep of enum Suit
     * @return Str val of type of Suit
     */
    public String getSuit(){ return suit.getStr(); }

    /**
     * Get method for val
     * @return val's value
     */
    public int getVal(){ return val; }

    /**
     * Get method for altval
     * @return altval's value
     */
    public int getAltVal(){ return altval; }

    /**
     * Abstract method for Display
     * <p>
     * Returns str value of Suit
     */
    public abstract String Display();
}