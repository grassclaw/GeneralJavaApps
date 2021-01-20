// Part b
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/08/2020
// ASSIGNMENT: Lab07 - LetterCounter
/* PURPOSE: This applicaiton outputs calculated amount of times a letter appears in a string
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
    - named user input variables --
        - String --> phrase
        - char --> letter to look for
        - double --> 
        - int    --> 
    - named calculated variables --
        - int    --> counter, letterCount
        - double --> 
*/
/*PROCESSING SECTION
    - Part 1: While loop for phrase count
    - Part 2: 
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: "I am a monkey king!", a/ "What is the rock cookin!", o / "hey", z
/*ERRORS
    Not case insensitive!!!! Accidentally used while loop also.
*/
/***********************************************************************************************/
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args){
        String phrase;
        char letter;
        int counter = 0, letterCount = 0;
        
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a string: ");
        phrase = stdin.nextLine();
        System.out.print("Enter a letter to count in this string: ");
        letter = stdin.next().charAt(0); 

        while(counter < phrase.length()){
            if (phrase.charAt(counter) == letter) {
                letterCount++;
            }
            counter++;
        }


        System.out.printf("The letter '%s' appears %d time(s) in the string: '%s'", letter, letterCount, phrase);

        stdin.close();
    }
}
