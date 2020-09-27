// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/22/2020
// ASSIGNMENT: Lab05a - If/Else Chains
/* PURPOSE: Demonstrate use of If/Else Chains
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
import java.util.*;

public class Lab5a {
   
    public static void main(String[] args){
        String choice;
        double height;
        double length;
        double radWidth; //acts as radius
        
        
        System.out.println("This program will calculate the volume and surface area");
        System.out.println("for one of the solids names in the menu. Please select one:");
        System.out.println("    A - Rectangular solid");
        System.out.println("    B - Cylinder");
        System.out.println("    C - Sphere");
        System.out.println("    D - Cone");

        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Enter the Letter of your choice:"); 
        choice = stdin.nextLine();
        if(choice == "A"){
            // System.out.println()
        }else if(choice == "B" || choice == "D"){

        }else if(choice == "C"){

        }else{
            System.out.println("Error: Invalid choice.");
        }

        stdin.close();

        System.out.println("Lab05a is now terminating...");



    }
}
