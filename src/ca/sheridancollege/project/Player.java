package ca.sheridancollege.project;


/**
 * A class that models the Player in the game.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Megha Patel
 * @author Nicholas Carvalho
 * @author Michael Elop
 * August 9, 2021
 */

public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}