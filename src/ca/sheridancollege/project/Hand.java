import java.util.ArrayList;
import java.util.List;

/**
 * A class that models as sample playing hand of War.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Megha Patel
 * @author Nicholas Carvalho
 * @author Michael Elop
 * August 9, 2021
 */

public class Hand {

    private List<Card> cards; //players individual cards


    public Hand() {
        this.cards = new ArrayList<Card>();
    }


    //merges another hand into this one
    public void mergeHand(Hand other) {
        for (Card c : other.cards) {
            this.addCardToBottom(c);
        }
    }


    //takes numCards of cards
    public List<Card> take(int numCards) {
        if (numCards > this.handSize()) {
            return null;
        }

        List<Card> out = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            out.add(this.cards.remove(this.handSize() - 1));
        }

        return out;
    }

    //Card object c added to end of array
    public void addCardToTop(Card c) {
        if (c == null) {
            throw new NullPointerException("Can't add a null card to a cards.");
        }
        cards.add(c);
    }

    //adds more than one card at a time to hand
    public void addCardsToTop(List<Card> cds) {
        this.cards.addAll(cds);
    }

    //single Card object c added to beginning of array
    public void addCardToBottom(Card c) {
        cards.add(0, c);
    }

    //removes the card from the last index of the array
    public Card removeCardFromTop() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(handSize() - 1);
    }

    //removes card from the first index of the array
    public Card removeCardFromBottom() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(0);
    }

    //returns the number of cards
    public int handSize() {
        return cards.size();
    }

}

