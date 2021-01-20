// Part b
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/13/2020
// ASSIGNMENT: Lab07 - DiceGame
/* PURPOSE: This applicaiton outputs calculated amount of times a letter appears in a string
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
        - int --> SUMBREAK (value 7)
    - named user input variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> 
    - named calculated variables --
        - int    --> leftDie, rightDie, rollingSum, maxSum
        - double --> 
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
    Not case insensitive!!!! Accidentally used while loop also.
*/
/***********************************************************************************************/
public class Lab07a_DiceGame {
    public static final int SUMBREAK = 7;

    public static void main(String[] args){
        double leftDie = 0;
        double rightDie = 0;
        double rollingSum = 0;
        double maxSum = 0;

        for(int count = 0; count < 4; count++){
            while ((leftDie + rightDie) != SUMBREAK){
                rollingSum = rollingSum + leftDie + rightDie;

                leftDie = Math.round(1 + Math.random()*6);
                rightDie = Math.round(1 + Math.random()*6);

                System.out.printf("Rolled %.0f and %.0f\n", leftDie, rightDie);
            
            }
            if (rollingSum > maxSum) {
                maxSum = rollingSum;
            }

            System.out.printf("Sum of rolls before rolling out %.0f.\n", rollingSum);

            leftDie = 0;
            rightDie = 0;
            rollingSum = 0;

        }
        System.out.printf("Best round had a dice sum of %.0f.\n", maxSum);
        System.out.println();
    }
}
