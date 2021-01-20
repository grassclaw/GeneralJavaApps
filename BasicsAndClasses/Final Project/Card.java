// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 11pm
// COMPLETION: 12/10/2020
// ASSIGNMENT: Final Project - Card
/* PURPOSE: This applicaiton 
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
    - Creates a card object with associated methods
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
        - String --> 
        - char --> 
        - double --> 
        - int    --> 
*/
/*PROCESSING SECTION
    - Part 1: There is a main method for testing purposes
    - Part 2: 
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 
/*ERRORS
    -
*/
/***********************************************************************************************/
public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    // FOR TESTING
    public static void main(String[] args) {
        Rank val1 = Rank.JACK;
        Suit val2 = Suit.HEARTS;
        Rank val3 = Rank.ACE;
        Suit val4 = Suit.SPADES;
        Card card1 = new Card(val1, val2);
        Card card2 = new Card(val3, val4);
        System.out.println("card 1: " + card1.toString());
        System.out.println("card 2: " + card2.toString());
        System.out.println("Comparing card 1 agains card 2");
        System.out.println("-1 is card1 < card2; 0 is equal; 1 is greater than => "+card1.compareTo(card2));
        System.out.println("Are the cards equal? "+card1.equals(card2));
    }

    // CLASS CARD AND METHODS BELOW
    public Card(Rank rank, Suit suit) {
        setRank(rank);
        setSuit(suit);
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }

    /* // compares against param card=> 
        -1 = less than param card
        0 = equal
        1 = greater than param card
     */
    public int compareTo(Card other) {
        int thisCount = 0;
        int otherCount = 0;
        for (Rank t : Rank.values()) {
            if (t == this.rank) {
                thisCount = this.rank.ordinal();
            }
        }
        for (Rank o : Rank.values()) {
            if (o == other.rank) {
                otherCount = other.rank.ordinal();
            }
        }
        if (thisCount == 0) {
            thisCount = 14;
        }
        if (otherCount == 0) {
            otherCount = 14;
        }

        if (equals(other)) {
            return 0;
        } else if (thisCount < otherCount) {
            return -1;
        } else {
            return 1;
        }
    }

    //Checks if cards are equal
    public boolean equals(Card other) {
        if (this.rank == other.rank) {
            return true;
        } else {
            return false;
        }
    }

}
