
/**
 * The game messages displayed 
 * collected in a single class
 * 
 * @author Nicholas Carvalho
 * @author Michael Elop
 * August 9, 2021
 */

public class PrintDisplay {

    public void openingMessage() {
        System.out.println("It's a war of cards!!\n" +
                "This Game is automated and will play until one deck is empty " + 
                "or the game reaches 50 rounds.\n" +
                "It's you against the CPU.\n");
        System.out.println("Please enter your name.");
        System.out.println("Indicate that you are ready by hitting enter.");
    }

    public void startGameMessage(Player player) {
        System.out.printf("%s ,let's Play!!\n", player.getName());
    }

    public void printRoundHeader(Player playerOne, Player playerTwo) {
        String header = "#CardsInHand";
        String winner = "Round Winner";
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", playerOne.getName(), 
                header, playerTwo.getName(), header, winner);
    }


    //print out winnings for each round and final winner of game
    public void declareRoundWinner(Player player1, Card card1, Player player2, 
            Card card2, String winner) {
        System.out.printf("%-20s %-20s %-20s %-20s %s is the winner.\n", 
                card1.toString(), player1.getHand().handSize(), card2.toString(), 
                player2.getHand().handSize(), winner);
    }

    //print war round
    public void declareWarRound() {
        System.out.println("\nWAR!! There was a tie and War was initiated.\n");
    }

    public void declareGameWinner(Player player) {
        System.out.printf("The winner of the game is %s!!\n", player.getName());
    }

    public void declareDraw() {
        System.out.printf("Sorry, the game ended in a draw...\n");
    }
}
