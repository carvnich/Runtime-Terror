import java.util.List;
import java.util.Scanner;

/**
 * The class that models our game being played.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Megha Patel
 * @author Nicholas Carvalho
 * @author Michael Elop
 * August 9, 2021
 */

public class Game {
    public static void main(String[] args) {
        Play game = new Play();
        game.startGame();
    }
}

class Play {
    //game deck
    private GroupOfCards deck;

    //game printer
    private static PrintDisplay printMessage = new PrintDisplay();

    //human player
    private Player humanPlayer;
    
    //CPU player
    private Player cpuPlayer;

    //start the game
    public void startGame() {
        //print opening message
        printMessage.openingMessage();

        // get player 1 name from stdin
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        this.humanPlayer = new Player(name);
        this.cpuPlayer = new Player("CPU");

        //start game message
        printMessage.startGameMessage(humanPlayer);

        //create fresh deck
        deck = new GroupOfCards();

        //shuffle deck
        deck.Shuffle();

        //create and set hands
        humanPlayer.setHand(new Hand());
        cpuPlayer.setHand(new Hand());

        //dealCards to hand
        dealCards(humanPlayer.getHand());
        dealCards(cpuPlayer.getHand());

        printMessage.printRoundHeader(humanPlayer, cpuPlayer);

        //show result
        int maxRounds = 50;
        Player winner = null;
        while (battle(humanPlayer, cpuPlayer, null)) {
            maxRounds--;

            //check hands for winner
            if (humanPlayer.getHand().handSize() == 0) {

                //cpu is winner
                winner = cpuPlayer;
                break;
            } else if (cpuPlayer.getHand().handSize() == 0) {

                //player is winner
                winner = humanPlayer;
                break;
            }

            if (maxRounds < 0) {
                break;
            }
        }

        if (winner != null) {

            //if someone won
        } else if (humanPlayer.getHand().handSize() > cpuPlayer.getHand().handSize()) {
            winner = humanPlayer;
        } else if (cpuPlayer.getHand().handSize() > humanPlayer.getHand().handSize()) {
            winner = cpuPlayer;
        } else {

            //if draw
            printMessage.declareDraw();
            return;
        }
        printMessage.declareGameWinner(winner);
    }

    //deal 26 cards to each hand in alternating order
    public void dealCards(Hand hand) {
        for (int i = 0; i < 26; i++) {
            hand.addCardToTop(deck.dealCard());
        }
    }

    //models a battle between player1 and player2. if the battle
    //results in a war, three cards from each player are placed
    //in the prize queue and the battle is continued recursively.
    public boolean battle(Player playerOne, Player playerTwo, Hand pot) {

        //both players show top card from deck, each player draws from top of deck
        //store cards that are in play in an array.
        Card playerOneFaceUp = playerOne.getHand().removeCardFromTop();
        if (playerOneFaceUp == null) {
            return false;
        }

        Card playerTwoFaceUp = playerTwo.getHand().removeCardFromTop();
        if (playerTwoFaceUp == null) {
            return false;
        }

        //in case of war, each player adds 3 cards to pot and the forth card is 
        //evaluated
        if (pot == null) {
            pot = new Hand();
        }
        pot.addCardToTop(playerOneFaceUp);
        pot.addCardToTop(playerTwoFaceUp);

        int result = playerOneFaceUp.compareTo(playerTwoFaceUp);
        switch (result) {
            case 0:
                printMessage.declareWarRound();

                //each player adds three cards to the prize hand
                List<Card> warPlayerOnePot = playerOne.getHand().take(3);
                if (warPlayerOnePot == null) {
                    return false;
                }
                pot.addCardsToTop(warPlayerOnePot);

                List<Card> warPlayerTwoPot = playerTwo.getHand().take(3);
                if (warPlayerTwoPot == null) {
                    return false;
                }
                pot.addCardsToTop(warPlayerTwoPot);

                return battle(playerOne, playerTwo, pot);
            case 1:
                //give all cards on table to player 1
                //player1 adds both face up cards to bottom of deck
                playerOne.getHand().mergeHand(pot);
                printMessage.declareRoundWinner(playerOne, playerOneFaceUp, 
                        playerTwo, playerTwoFaceUp, playerOne.getName());
                break;
            case -1:
                //give all cards on table to player 2
                //player2 adds both face up cards to bottom of deck
                playerTwo.getHand().mergeHand(pot);
                printMessage.declareRoundWinner(playerOne, playerOneFaceUp, 
                        playerTwo, playerTwoFaceUp, playerTwo.getName());
                break;
        }

        return true;
    }
}
