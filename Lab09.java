import java.util.Scanner;

// Part a
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/27/2020
// ASSIGNMENT: Lab09 - Conversion Program for distances -  textbook, page 313-314
/* PURPOSE: This appllication
    - converts a distance specified by the user and converts it based on their desire
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
        - String --> 
        - Double --> meter to km, m to inch, m to feet (all the product)
    - named user input variables --
        - String --> 
        - char   --> 
        - double --> 
        - int    --> distance, conversion desired
    - named calculated variables --
        - String --> 
        - double --> calculated converted distance
        - int    --> 
        - Scanner--> 
*/
/*PROCESSING SECTION
    - Part 1: Switch for desired conversion
    - Part 2: 
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 100, 1
/*ERRORS
   -
*/
/***********************************************************************************************/
public class Lab09 {
    static final double M_TO_KM = 0.001;
    static final double M_TO_INCH = 0.03937008;
    static final double M_TO_FT = 0.00328084;
    public static void main(String[] args){
        int distance;
        int conversion;

        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a distance in metters: ");
        distance = stdin.nextInt();
        
        System.out.println("1. Conver to kilometers");
        System.out.println("2. Conver to inches");
        System.out.println("3. Conver to feet");
        System.out.println("4. Quit the program");
        System.out.print("Enter your choice: ");
        conversion = stdin.nextInt();

        if(conversion != 4){
            convertUnit(distance, conversion);
        }else{
            System.out.println("Bye!");
        }
    }

    public static double convertUnit(int distance, int conversion){
        double calcDistance = 1.0;
        switch(conversion){
            case 1: 
                calcDistance = distance * M_TO_KM;
                System.out.println(distance + " meters is "+ calcDistance + " kilometers.");
                break;
            case 2:
                calcDistance = distance * M_TO_INCH;
                System.out.println(distance + " meters is "+ calcDistance + " inches.");
                break;
            case 3:
                calcDistance = distance * M_TO_FT;
                System.out.println(distance + " meters is "+ calcDistance + " feet.");
                break;
        }
        return calcDistance;
    }    

}
