import java.util.Scanner;

// Part a
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/13/2020
// ASSIGNMENT: Lab07 - MinMax
/* PURPOSE: This applicaiton outputs max and min of entered integers
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
    - named user input variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> sentinal value
    - named calculated variables --
        - int    --> max, min, count to keep track of amount of entries
        - double --> 
*/
/*PROCESSING SECTION
    - Part 1: while loop to continue accepting entries 
    - Part 2: embedded if statement in while loop to replace max, min accordingly1
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 77, 34, 99, 120, 0, 77
/*ERRORS
   -
*/
/***********************************************************************************************/
public class Lab07b_MinMax {
    
    public static void main(String[] args){
        int max, min;
        int input;
        int count = 0;
        int sentinel = 0;

        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        sentinel = max = min = stdin.nextInt();
        //ensures input will not be sentinal right away by accident
        input = sentinel-1;

        while(input != sentinel){
            System.out.print("Enter another integer: ");
            input = stdin.nextInt();
            
            count ++;

            if(input > max){
                max = input;
            }

            if(input < min){
                min = input;
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        System.out.println("Number of inputs: " + count);
        System.out.println();

        stdin.close();

    }
}
