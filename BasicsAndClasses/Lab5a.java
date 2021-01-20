// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/22/2020
// ASSIGNMENT: Lab05a - If/Else Chains
/* PURPOSE: Demonstrate use of If/Else Chains
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> call on Math.PI
    - User input -->
        -double: height, length, radius/width
    - Calculated -->
        - volume, surface Area
*/
/*PROCESSING SECTION
    - Determines volume and surface area of various 3D shapes as provided
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    -Note: Test cases are:
***********************************************************************************************/
package javaActivities;

import java.util.*;

public class Lab5a {
   
    public static void main(String[] args){
        String choice;
        double height = 0;
        double length = 0;
        double radWidth = 0; //acts as radius
        double volume = 0;
        double surfArea = 0;
        
        System.out.println("This program will calculate the volume and surface area");
        System.out.println("for one of the solids names in the menu. Please select one:");
        System.out.println("    A - Rectangular solid");
        System.out.println("    B - Cylinder");
        System.out.println("    C - Sphere");
        System.out.println("    D - Cone");

        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the Letter of your choice: "); 
        choice = stdin.nextLine();
        //Concat first letter and lowercase it to meet conditionals
        choice = choice.substring(0,1).toLowerCase();

        //conditional print statements
        if(choice.equals("a")){ //Rectangular Prison
            System.out.print("Enter the length of the rectangular solid: ");
                length = stdin.nextDouble();
            System.out.print("Ender the width of the rectangular solid: ");
                radWidth = stdin.nextDouble();
            System.out.print("Ender the height of the rectangular solid: ");
                height = stdin.nextDouble();

            System.out.println("Rectangular Solid Data:");
            volume = length * radWidth * height;
            surfArea = 2 * (length * (radWidth + height) + (radWidth * height));
                
        }else if(choice.equals("b")){ //Cylinder
            System.out.print("Enter the radius of the cylinder: ");
                radWidth = stdin.nextDouble();
            System.out.print("Enter the height of the cylinder: ");
                height = stdin.nextDouble();

            System.out.println("Cylinder Data:");
            volume = Math.PI * Math.pow(radWidth, 2) * height;
            surfArea = 2 * Math.PI * radWidth * height + 2 * Math.PI * (Math.pow(radWidth, 2));

        }else if(choice.equals("c")){ //Sphere
            System.out.print("Enter the radius of the sphere: ");
                radWidth = stdin.nextDouble();

            System.out.println("Sphere Data:");
                volume = 4 * Math.PI * Math.pow(radWidth, 3) / 3;
                surfArea = 4 * Math.PI * Math.pow(radWidth, 2) ;

        }else if(choice.equals("d")){ //Cone
            System.out.print("Enter the height of the cone: ");
                height = stdin.nextDouble();
            System.out.print("Enter the radius of the cone: ");
                radWidth = stdin.nextDouble();
            
            System.out.println("Cone Data:");
                volume = Math.PI * Math.pow(radWidth, 2) * height / 3;
                surfArea = Math.PI * radWidth * (radWidth = Math.sqrt(Math.pow(height, 2)+Math.pow(radWidth, 2)));

        }else{
            System.out.println("Error: Invalid choice.");
            return;
        }


        System.out.print("    Volume = ");
        System.out.format("%.3f", volume);
        System.out.println();
        System.out.print("    Surface Area = ");
        System.out.format("%.3f", surfArea);
        System.out.println();
        System.out.println("Lab05a is now terminating...");

        stdin.close();

    }
}
