/* PURPOSE: Abstraction of a physical pair of dice and will be created once for the duration of the game.
Let's Boxcars know what was rolled (snake eyes, box cars, double, etc.)
Pair of dice object is rolled not the individual die
Default constructor creates a 60sided die
*/
/*CLASSPATH
    PAIROFDICE --> DIE
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
    - Part 1: 
    - Part 2: 
*/
/*OUTPUTS
    - System output roll values as string, can also return as int
/*ERRORS
    -
*/
/***********************************************************************************************/
public class PairOfDice {
    private Die die1;
    private Die die2;

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    public int getDie1() {
        return die1.getFace();
    }

    public int getDie2() {
        return die2.getFace();
    }

    public void roll() {
        // Call set method for die
        // and pass it the resolt of the roll method from the die object
        // this might seem circular to have a set method but it keeps things clear
        die1.setFace(die1.roll());
        die2.setFace(die2.roll());
    }

    public String toString() {
        String resRoll = "      Rolled: " + die1.toString() + " and " + die2.toString();
        return resRoll;
    }

}
