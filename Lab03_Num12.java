// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/15/2020
// ASSIGNMENT: Lab03 - 12 - String Manipulator
/* PURPOSE: Calculates and displays manipulated string input from user and string stats
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> none
    - string variables to hold user input of city name
*/
/*PROCESSING SECTION
    - System output variations for char
*/
/*OUTPUTS
    - Output char method manipulations of string
    -Note: Test cases are: Edmonton, Los Angeles, Toronto, Mexico City
***********************************************************************************************/
package Lab03;

import java.util.Scanner;

public class Lab03_Num12 {

    public static void main(String[] args){

        String city;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please enter your favorite city: ");
        city = stdin.nextLine();
        stdin.close();

        //Outputs strings with called char methods to calculed length without spaces, and manipulate string
        System.out.println("The number of characters in the city name: "+ city.replace(" ","").length());
        System.out.println("The name of the city in all upercase letters: "+ city.toUpperCase());
        System.out.println("The name of the city in all lowercase letters: "+ city.toLowerCase());
        System.out.println("The first character in the name of the city: "+ city.charAt(0));

    }

}
