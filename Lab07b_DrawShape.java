// Part a
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
        - int --> 
    - named user input variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> shapeSize
    - named calculated variables --
        - int    --> loop iterators x, y, z
        - double --> 
*/
/*PROCESSING SECTION
    - Part 1:  
    - Part 2: 
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 10, 5, 8
/*ERRORS
    Not case insensitive!!!! Accidentally used while loop also.
*/
/***********************************************************************************************/
import java.util.Scanner;

public class lab07b_DrawShape {
    public static void main(String[] args){
        int size;

        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the size: ");
        size = stdin.nextInt();

        for(int x = 0; x < size; x ++){
            //left stars
            for(int y = 0; y < size - (size - x - 1); y++){
                System.out.print("*");
            }
            //spaces
            for(int z = 0; z < 2*(size - x - 1); z++){
                System.out.print(" ");
            }
            //right stars
            for(int y = 0; y < size - (size - x - 1); y++){
                System.out.print("*");
            }
            //start new line
            System.out.println();
        }

    }
}
