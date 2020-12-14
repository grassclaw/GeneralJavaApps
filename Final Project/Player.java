// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 11pm
// COMPLETION: 12/10/2020
// ASSIGNMENT: Final Project - Player
/* PURPOSE: This applicaiton 
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
    - 
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --
        - String --> 
        - char --> 
        - double --> 
        - int    -->  
    - named user input variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> 
    - named calculated variables --
        - String --> name
        - char --> 
        - double --> 
        - int    --> 
        - types --> 
*/
/*PROCESSING SECTION
    - Part 1: 
    - Part 2: 
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 
/*ERRORS
    - NONE! :)
*/
/***********************************************************************************************/
public class Player {
    private String name;
    private Card[] hand = new Card[0];

    // call two for the purpose of testing it in main
    // starting off the hand is 0 before being constructed
    // use .addElement to grow
    // to shrink then pass between two arrays etc
    public static void main(String[] args) {
        Deck gameDeck = new Deck();
        Player player1 = new Player("Billy Bob");
        Card[] list = new Card[3]; //0 1 2

        // deal one card
        Card C = gameDeck.deal();
        player1.addCardToHand(C);
        // deal second card
        C = gameDeck.deal();
        player1.addCardToHand(C);
        // Show hand
        System.out.printf("%s's HAND: \n", player1.name);
        player1.showHand();
        // Play Card
        C = player1.playCard();
        System.out.printf("%s played %s\n", player1.name, C.toString());
        System.out.println("Cards left: " + player1.report());
        // Show hand
        System.out.printf("%s's HAND: \n", player1.name);
        player1.showHand();

        //ADDING PLAYED CARD TO BILLYS HAND PLUS SOME JUST TO TEST
        list[0] = C;
        list[1] = gameDeck.deal();
        list[2] = gameDeck.deal();
        player1.collectTrick(list);
        player1.showHand();

        System.out.printf("There %s %d %s left\n", ((gameDeck.report() > 0) ? "are" : "is"), gameDeck.report(),
                ((gameDeck.report() > 0) ? "cards" : "card"));
    }

    public Player(String playerName) {
        this.name = playerName;
    }

    public void addCardToHand(Card C) {
        int nLength = report() + 1;
        Card[] temp = new Card[nLength]; // New length of the array
        for (int i = 0; i < temp.length - 1; i++) {
            temp[i] = hand[i];
        }
        temp[nLength - 1] = C;
        // assign back to hand
        hand = temp;
    }

    public void collectTrick(Card[] list) {
        int nLength = report() + list.length;
        Card[] temp = new Card[nLength]; // New length of the array
        System.out.println("LENGTH: " + temp.length);
        for (int i = 0; i < hand.length; i++) {
            temp[i] = hand[i];
        }
        for (int i = 0; i < list.length; i++) {
            temp[i+hand.length] = list[i];
        }
        // assign back to hand
        hand = temp;
    }

    public Card playCard() {
        int nLength = report() - 1; // reduce length of array
        Card played = hand[nLength]; // always need to subtract 1 anyways so this works
        Card[] temp = new Card[nLength]; // New length of the array
        for (int i = 0; i < temp.length; i++) {
            temp[i] = hand[i];
        }
        // assign back to hand
        hand = temp;
        return played;
    }

    public int report() {
        return hand.length;
    }

    public void showHand() {
        for (int i = 0; i < hand.length; i++) {
            System.out.println("-"+hand[i]);
        }
    }

}