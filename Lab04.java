// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/17/2020
// ASSIGNMENT: Lab04 - Magic Date
/* PURPOSE: Reads in date from  user and determines if it is magic
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> none
    - integer variables to hold user input of number for month, day, and two-digit year
    - string for formatted date
*/
/*PROCESSING SECTION
    - Determines if a date is magic (product of month and day = two digit year)
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    -Note: Test cases are: 04/11/44; 02/03/06; 02/06/20; 12/03/36
***********************************************************************************************/

package Lab04;

import java.util.*;

public class Lab04 {
    public static void main(String args[]) {

        int month;
        int day;
        int year;
        
        //User Summary
        System.out.println("This program will have you enter a date and then");
        System.out.println("it will tell you if that date is a magic date...");
        System.out.println();

        //Scanner moment
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the number for a month: ");
        month = stdin.nextInt();
        System.out.print("Enter the number for a day: ");
        day = stdin.nextInt();
        System.out.print("Enter a two digit year: ");
        year = stdin.nextInt();

        stdin.close();
        System.out.println();

        //conditional output
        if((month*day)==year){
            System.out.printf("Your date (%02d/%02d/%02d) is magic!\n", month, day, year);
        }else{
            System.out.printf("Sorry, your date (%02d/%02d/%02d) is not magic.\n", month, day, year);
        }
        System.out.println();

    }
}
