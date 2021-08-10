package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A standard deck of cards. 
 * 52 cards in total made up of 4 suits of cards
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Megha Patel
 * @author Nicholas Carvalho
 * @author Michael Elop
 * August 9, 2021
 */

public class GroupOfCards {

    private final List<Card> cards = new ArrayList<Card>();

    GroupOfCards() {
        createDeck();
    }

    private void createDeck() {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards.add(new Card(r, s));
            }
        }
    }

     //shuffles the deck so the cards are random
    public void Shuffle() {
        Collections.shuffle(this.cards);
    }

     //returns a List of Card type
    public List<Card> getCards() {
        return this.cards;
    }

     //returns the number of cards left in the deck
    public int getCardsCount() {
        return this.cards.size();
    }

    //deals a card from the top of the deck, removing it from the deck.
    //returns a card from the end of the arrayList
    public Card dealCard() {
        return this.cards.remove(this.cards.size() - 1);
    }

     //adds a card to the bottom of the deck.
    public void addCard(Card c) {
        this.cards.add(0, c);
    }

    //a String containing all of the cards in order
    @Override
    public String toString() {
        return this.cards.toString();
    }
}