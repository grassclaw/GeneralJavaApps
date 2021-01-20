
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 11pm
// COMPLETION: 12/10/2020
// ASSIGNMENT: Final Project - Deck
/* PURPOSE: This applicaiton 
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
    - Create a deck of cards (52 cards) from card object with a default constructor
*/
/*INPUTS SECTION: 
    - named constants --
        - String --> 
        - char --> 
        - double --> 
        - int    -->  DECK SIZE
    - named user input variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> 
    - named calculated variables --
        - String --> 
        - char --> 
        - double --> 
        - int    -->
        - types --> Card type called
*/
/*PROCESSING SECTION
    - Part 1: main method for testing
    - Part 2: methods and default constructor for making a deck of 52 cards
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 
/*ERRORS
    - No errors
*/
/***********************************************************************************************/
import java.util.Random;

public class Deck {
    final private int SIZE = 52;
    private Card[] deck;
    private int topCard;

    public static void main(String[] args) {
        // checking deck creation
        Deck gameDeck = new Deck();
        System.out.println(gameDeck.toString());
        // checking deck management

        for (int i = 0; i < 25; i++) {
            Card dealt1 = gameDeck.deal();
            Card dealt2 = gameDeck.deal();

            System.out.println("Player 1 was dealt " + dealt1.toString());
            System.out.println("Player 2 was dealt: " + dealt2.toString());
        }
        System.out.printf("There %s %d %s left\n", ((gameDeck.report() > 0) ? "are" : "is"), gameDeck.report(),
                ((gameDeck.report() > 0) ? "cards" : "card"));
        System.out.println(gameDeck.toString());

    }

    // Default constructor; iterates through enums
    public Deck() {
        deck = new Card[SIZE];
        topCard = 51; // Assume top is 52 place
        int i = 0;
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                deck[i] = new Card(r, s);
                i++; // increment i here
            }
        }
        shuffle();
    }

    // Deal top card. Since top is 0, adding means deck is smaller, subtract is
    // bigger
    public Card deal() {
        topCard--;
        // we decreased deck so need to adjust by one for the proper index
        return deck[topCard + 1];
    }

    public int report() {
        return topCard + 1;
    }

    // We assume 52 cards when shuffling;
    // Randomly swap 52 cards. In real life, the entire deck does not become
    // completely random.
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            // grab 2 indices for 2 cards to swap at random (0-51)
            int in1 = rand.nextInt(SIZE);
            int in2 = rand.nextInt(SIZE);
            Card tCard = deck[in2];
            deck[in2] = deck[in1];
            deck[in1] = tCard;
        }
    }

    // Print cards in the deck at any given point
    public String toString() {
        String d = "";
        for (int i = 0; i < topCard + 1; i++) {
            d += ("Card " + (i + 1) + ": " + deck[i].toString());
            if (i != topCard) {
                d += "\n";
            }
        }
        return d;
    }
}