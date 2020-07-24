import java.util.Scanner;

/**
 * <b>Program simulates a game of blackjack</b>
 * <p>
 * CMSY 166 002
 * <p>
 * Java I
 * <p>
 * Due: May 14, 2019
 * 
 * @author Sage Garcia
 */
public class DRIVER {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Starts the game
        // Asks user if they want to play
        System.out.println(" \n- - - - - - LET'S PLAY BLACKJACK - - - - - -\n");
        System.out.print("Would you like to play (1 for yes, 0 for no)? ");
        int go = reader.nextInt();

        // If user enters 1, enter loop
        while (go > 0) {

            // Calls playGame method
            playGame();
            System.out.print("Would you like to play again (1 for yes, 0 for no)? ");

            // Sentinel val for loop
            go = reader.nextInt();
            System.out.println();
        }

        System.out.println("\nExiting Game...\n");

        // Closes Scanner obj
        reader.close();
    }

    /**
     * Simulates a blackjack game by creating a deck and two hands
     * <p>
     * one for the dealer and one for the user
     */
    public static void playGame() {
        Scanner reader = new Scanner(System.in);

        // Set int to 0
        int go = 0;

        // Creates a deck and two hands
        Deck deck = new Deck();
        Hand user = new Hand();
        Hand dealer = new Hand();

        System.out.println("\n> > > DEALING CARDS! < < <\n");

        // Deal 2 cards to dealer and user
        // User and dealer takes cards and adds them to their hands
        user.takeCard(deck.dealCard());
        user.takeCard(deck.dealCard());
        dealer.takeCard(deck.dealCard());
        dealer.takeCard(deck.dealCard());

        // Display hands
        System.out.println("Your hand: " + user.displayHand());
        System.out.println("Dealer's hand: " + dealer.displayHand());

        System.out.println("\n- - - - - - YOUR TURN - - - - - -\n");

        // Loops through until user says no
        do {
            System.out.print("Would you like another card (1 for yes, 0 for no)? ");

            // Sentinel val
            go = reader.nextInt();

            if (go > 0) {

                // User takes a card from deck and adds it to their hand
                user.takeCard(deck.dealCard());

                // Display card taken
                // Display user's hand
                // Display dealer's hand
                System.out.println("You took a card... It's a " + user.getLastCard());
                System.out.println("\nYour hand: " + user.displayHand());
                System.out.println("Dealer's hand: " + dealer.displayHand() + "\n");

                // If user's cards goes up to > 21, break through loop and user loses
                if (user.calculateValue() > 21) {
                    break;
                }
            }

        } while (go > 0);

        // If user hasn't lost yet, continue with game
        if (user.calculateValue() <= 21) {
            System.out.println("\n- - - - - - DEALER'S TURN - - - - - -\n");

            // Dealer takes cards from deck until they all total to an int greater than or
            // equal to 17
            while (dealer.calculateValue() < 17) {
                dealer.takeCard(deck.dealCard());

                // Display card taken
                // Display dealer's hand
                System.out.println("Dealer took a card... It's a " + dealer.getLastCard());
                System.out.println("Dealer's hand: " + dealer.displayHand() + "\n");
            }

            System.out.println("Dealer's turn is done\n");
        }

        int dsum = dealer.calculateValue();
        int usum = user.calculateValue();

        // If user has more than 21 total, user loses
        // If dealer has more than 21 total, user wins
        // If tie, user loses
        // Whoever has total closest to 21 w/o going over wins
        if (dsum > 21) {
            System.out.println("You win!\n");
        } else if (usum > 21 || usum == dsum) {
            System.out.println("You lose!\n");
        } else if (usum > dsum) {
            System.out.println("You win!\n");
        } else {
            System.out.println("You lose!\n");
        }

    }

}