import java.util.Scanner;

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
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 
/*ERRORS
    -
*/
/***********************************************************************************************/
public class Boxcars {
    private PairOfDice dice;
    private int computerScore;
    private int humanScore;
    private String humanName;

    public void init(String name) {
        dice = new PairOfDice();
        humanName = name;
        computerScore = 0;
        humanScore = 0;
    }

    // Everything below this is game play
    public void playGame() {
        while ((humanScore < 150 && computerScore < 150) || humanScore == computerScore) {
            // COMPUTER TURN
            System.out.println("Computer's turn:");
            computerScore += setScore("computer");
            System.out.printf("CURRENT GAME SCORE: Computer:%d     %s:%d\n", computerScore, humanName, humanScore);
            userEnter();
            // HUMAN TURN
            System.out.println(humanName + "'s turn:");
            humanScore += setScore("human");
            System.out.printf("CURRENT GAME SCORE: Computer:%d     %s:%d\n", computerScore, humanName, humanScore);
            userEnter();
        }
        // FINAL CONCLUSION
        if (computerScore > 150 && computerScore > humanScore) {
            System.out.println("Sorry, " + humanName + " you got beat by the computer!");
        } else {
            System.out.println(humanName + ", Congratulations! you beat the computer!");
        }
    }

    private void userEnter() {
        System.out.print("\nPress [ENTER] to continue...");
        try {
            System.in.read();
            System.in.skip(System.in.available());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int setScore(String user) {
        // returns -1 if turn is lost
        int round = 0;
        int turnScore = 0;
        int multiplier = 0;
        String c = "Y";
        Scanner input = new Scanner(System.in);

        while (round < 5 && c.equalsIgnoreCase("Y")) {
            dice.roll();
            System.out.println(dice.toString());

            if (dice.getDie1() != dice.getDie2()) {
                turnScore += dice.getDie1() + dice.getDie2();
            } else if (dice.getDie1() == dice.getDie2()) {
                if (dice.getDie1() == 1) {
                    System.out.println("      Rolled snake eyes! All turn points will be doubled.");
                    turnScore += 2;
                    multiplier += 1;
                } else if (dice.getDie1() == 6) {
                    System.out.println("      Rolled box cars! All points are gone now!");
                    if(user.equalsIgnoreCase("computer")){
                        computerScore = 0;
                        return 0;
                    }else{
                        humanScore = 0;
                        return 0;
                    }
                } else {
                    turnScore = 0;
                    System.out.println("         Rolled double. . . lose all turn points.");
                    return turnScore;
                }
            }
            System.out.println("      Current Score for this turn: " + turnScore);

            // HUMAN SPECIFIC CHOICE
            if (user.equalsIgnoreCase("human") && round < 4) {
                System.out.print("Roll again? (y/n) ");
                c = input.nextLine();
                if (c.equalsIgnoreCase("N")) {
                    return turnScore * (int) Math.pow(2, multiplier);
                }
            }
            // Computer specific
            if (user.equalsIgnoreCase("computer") && turnScore > 20) {
                return turnScore * (int) Math.pow(2, multiplier);
            }
            round++;
        }
        return turnScore * (int) Math.pow(2, multiplier);
    }
}
