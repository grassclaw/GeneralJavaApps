// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/28/2020
// ASSIGNMENT: Lab05b - Triangle Coordinates
/* PURPOSE: Determine if the provided coordinates are in the alloted triangle area.
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
    - named user input variables --
        - doubles --> x1 , x2, x3, y1, y2, y3
    - named calculated variables --
        -doubles --> slope1, slope2, slope3
*/
/*PROCESSING SECTION
    - Part 1: Determine if coordinates are in a given triangular area
    - Part 2: Determine if coordinates are collinear
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 80 60; 200 0; .5 101
      --> Part 2: -8 -8/0 0/5 5; -5 0/ 0 0/ 5 .1; 0 135/ 0 0/ 0 -80
***********************************************************************************************/

import java.util.*;

public class Lab5b {
    public static void main(String[] args){
        //coordinate variables
        double x1, x2, x3;
        double y1, y2, y3;
        //calculated slope variables
        double slope1, slope2, slope3;

        Scanner stdin = new Scanner(System.in);

        //Begin part 1
        System.out.println("Part 1:");
        System.out.println("Enter the coordinates of a point and I will tell you");
        System.out.println("  whether that point lies in the triangle: (0, 0), (200, 0), (0, 100):");
        System.out.print(" Your x and y coordinates with space between them: ");

        x1 = stdin.nextDouble();
        y1 = stdin.nextDouble();

        //check if outside hypotnuse and x and y bounds
        if((y1 >= 0) && (x1 >= 0) && ((x1 + (2 * y1)) <= 200)){
            System.out.println(" Your point IS in the triangle.");
        }else{
            System.out.println(" Your point is NOT in the triangle.");
        }

        System.out.println();
        
        //Begin Part 2
        System.out.println("Part 2:");
        System.out.println("Enter the coordinates for 3 points and I will tell you");
        System.out.println("  whether those points are collinear. . .");

        System.out.print(" First point's x and y coordinates with a space between them: ");
        x1 = stdin.nextDouble();
        y1 = stdin.nextDouble();
        System.out.print(" Second point's x and y coordinates with a space between them: ");      
        x2 = stdin.nextDouble();
        y2 = stdin.nextDouble();
        System.out.print(" Third point's x and y coordinates with a space between them: ");      
        x3 = stdin.nextDouble();
        y3 = stdin.nextDouble();

        //Determine all possible slopes from 3 points
        slope1 = (y2 - y1) / (x2 - x1); //point 1 and 2
        slope2 = (y3 - y2) / (x3 - x2); //point 2 and 3
        slope3 = (y3 - y1) / (x3 - x1); //point 1 and 3

        if(slope1 == slope2 && slope2 == slope3){
            System.out.print("The entered points are collinear.");
        }else{
            System.out.print("The entered points are NOT collinear.");
        }
        System.out.println();

        stdin.close();
        
    }
}
