package ca.sheridancollege.project;


/**
 * A single playing card (from a standard 52 card deck).
 * Consists of: a suit value, a rank value, and card value
 * 
 * @author dancye
 * @author Megha Patel
 * @author Nicholas Carvalho
 * @author Michael Elop
 * August 9, 2021
 */

public class Card implements Comparable<Card> {

    private final Rank rank;
    private final Suit suit;
    private final String card;


    Card(Rank rank, Suit suit) {
        if (rank == null || suit == null) {
            throw new NullPointerException();
        }
        this.rank = rank;
        this.suit = suit;
        this.card = String.format("%s%s", rank.toString(), suit.getSymbol());
    }

    //enum name of a card objects suit
    public Suit getSuit() {
        return this.suit;
    }

    //shorthand of an objects suit
    public String getSuitLetter() {
        return this.suit.getSymbol();
    }

    //enum name of a card objects rank
    public Rank getRank() {
        return this.rank;
    }

    //shorthand of an objects rank
    public String getRankLetter() {
        return this.rank.toString();
    }

    //number indicating how many points the card is worth
    public Integer getCardPoints() {
        return this.rank.getPointValue();
    }

    //shorthand of an objects rank and suit
    public String getCard() {
        return this.card;
    }

    public int compareTo(Card other) {
        return this.getCardPoints().compareTo(other.getCardPoints());
    }

    public boolean isSameSuit(Card other) {
        return this.suit.equals(other.suit);
    }

    public boolean isSameRank(Card other) {
        return this.rank.equals(other.rank);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Card.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Card other = (Card) obj;
        return this.suit == other.suit && this.rank == other.rank;
    }

    //full written name of a card object
    @Override
    public String toString() {
        return this.rank.getRankName() + " of " + this.suit.getSuitName();
    }

}