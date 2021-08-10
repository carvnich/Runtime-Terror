
/**
 * The four suits in a standard deck of cards.
 * 
 * @author Nicholas Carvalho
 * @author Michael Elop
 * August 9, 2021
 */

public enum Suit {
    DIAMONDS("Diamonds", "D"),
    SPADES("Spades", "S"),
    CLUBS("Clubs", "C"),
    HEARTS("Hearts", "H");

    private String suitName;
    private String symbol;

    Suit(String suitName, String symbol){
        this.suitName = suitName;
        this.symbol = symbol;
    }

    //returns the shorthand of suit
    public String getSymbol(){
        return this.symbol;
    }

    //returns the longhand of suit
    public String getSuitName() {
        return this.suitName;
    }

    //returns the shorthand of suit
    @Override
    public String toString() {
        return this.getSymbol();
    }

}
