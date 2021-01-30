// PROGRAMMER: Aaron Escamilla
// COMPLETION: 01/25/2021
// ASSIGNMENT: Lab12 - Array Methods
/* PURPOSE: This applicaiton 
    -calculate x,y of second destination based on initial distination, horizontal angle, distance
*/
/*INPUTS SECTION: Scanner utilized for user input
    - User inputs initial location, angle, and distance
 
*/
/*OUTPUTS
    - System outputs coordinates of second location (x,y)
/*ERRORS
    - NONE
*/
/***********************************************************************************************/

package ObjectOriented.spaceship;

import java.util.*;

public class Spaceship{
    public static void main(String[] args){
        //assuming possible double for each inputed value
        double x = 0;
        double y = 0;
        double dist = 0; //distance
        double angle = 0;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Hello! Welcome to x,y-topia!");
        System.out.println("We will need some coordinates for starting point!");
        System.out.print("What is the x coordinate? ");
        x = stdin.nextDouble();
        System.out.print("What is the y coordinate? ");
        y = stdin.nextDouble();
        System.out.print("What is the distance? ");
        dist = stdin.nextDouble();
        System.out.print("What is the horizontal angle? ");
        angle = stdin.nextDouble();
        System.out.println("********CALCULATING******** ");


        Destination final_local = getDestination(x,y,angle, dist);

        stdin.close();

        System.out.printf("Your x coordinate is: %.2f \n", final_local.x1.toString());
        System.out.printf("Your x coordinate is: %.2f \n", final_local.y1.toString());
    }

    public static Destination getDestination(double x1, double y1, double angle, double dist){
        double a,dx,dy;
        double x2=0;
        double y2 = 0;
        
        a = angle * Math.PI/180;
        dx = dist*Math.cos(a);
        dy = dist*Math.sin(a);
        x2 = x1 + dx;
        y2 = y1 + dy;
        
        return new Destination(x2, y2);
    }

}
