// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/30/2020
// ASSIGNMENT: Lab06b - RunningTheRace
/* PURPOSE: Print racers in order of 2st place to last based on time using as little relational operators
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
    - named user input variables --
        - String --> runner1-3
        - Double --> time1-3
    - named calculated variables --
        - String --> nameStore1 (placeholder), nameStore2, nameStore3
*/
/*PROCESSING SECTION
    - Part 1: Determine order of winners
    - Part 2: Arrange names according to order of time
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: Larry 3.18, Deema 2.33, Goby 2.35/ Larry 3.18, Moe 3.2, Curly 3.17
*/
/* EXTRA REQUESTS
    -RELATIONAL EXPRESSIONS USED --> 7
*/ 
/***********************************************************************************************/
import java.util.Scanner;

public class RunningTheRace {
    public static void main(String[] args){
        String runner1, runner2, runner3;
        Double time1, time2, time3;
        String nameStore1 = "";
        String nameStore2 = "";
        String nameStore3 = "";

        Scanner stdin = new Scanner(System.in);

        System.out.println("This program displays the first, second, and third");
        System.out.println("place runners in a race. No ties, please.");
        System.out.println();
        System.out.println();

        System.out.print("Enter the first runner's name: ");
        runner1 = stdin.nextLine();
        runner1 = runner1.substring(0, 1).toUpperCase() + runner1.substring(1).toLowerCase();
        System.out.print("Enter the first runner's time: ");
        time1 = stdin.nextDouble();
        stdin.nextLine();

        System.out.print("Enter the second name: ");
        runner2 = stdin.nextLine();
        runner2 = runner2.substring(0, 1).toUpperCase() + runner2.substring(1).toLowerCase();
        System.out.print("Enter the second runner's time: ");
        time2 = stdin.nextDouble();
        stdin.nextLine();
        
        System.out.print("Enter the third name: ");
        runner3 = stdin.nextLine();
        runner3 = runner3.substring(0, 1).toUpperCase() + runner3.substring(1).toLowerCase();
        System.out.print("Enter the third runner's time: ");
        time3 = stdin.nextDouble();
        stdin.nextLine();

        stdin.close();

       
        if (time1 < time2 && time1 < time3) {
            nameStore1 = runner1;
            if (time2 < time3) {
                nameStore2 = runner2;
                nameStore3 = runner3;
            } else {
                nameStore2 = runner3;
                nameStore3 = runner2;
            }
        } else if (time2 < time1 && time2 < time3) {
            nameStore1 = runner2;
            if (time1 < time3) {
                nameStore2 = runner1;
                nameStore3 = runner3;
            } else {
                nameStore2 = runner3;
                nameStore3 = runner1;
            }

        } else {
            nameStore1 = runner3;
            if (time1 < time2) {
                nameStore2 = runner1;
                nameStore3 = runner2;
            } else {
                nameStore2 = runner2;
                nameStore3 = runner1;
            }
        }

        System.out.println("1st place: " + nameStore1);
        System.out.println("2nd place: " + nameStore2);
        System.out.println("3rd place: " + nameStore3);
        System.out.println();
        System.out.println("Done. Thanks for running the race!");
        System.out.println();
    
    }
}
