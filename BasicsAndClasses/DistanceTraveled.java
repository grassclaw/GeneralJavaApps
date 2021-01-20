// Part a
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/08/2020
// ASSIGNMENT: Lab07 - DistanceTraveled
/* PURPOSE: This applicaiton outputs calculated distance by the hour
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
    - named user input variables --
        - double --> speed
        - int    --> time
    - named calculated variables --
        - int    --> counter
        - double --> distance
*/
/*PROCESSING SECTION
    - Part 1: While loop distance is calculated by the hour
    - Part 2: 
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 10, 5 / 40, 3
***********************************************************************************************/

import java.util.Scanner;

public class DistanceTraveled {
   public static void main(String[] args){
        double distance;
        double speed = -1;
        int time = 0;
        int counter = 1;

        Scanner stdin = new Scanner(System.in);
        while(speed < 0){
            System.out.print("What is the speed of the vehicle (mph): ");
            speed = stdin.nextDouble();
            stdin.nextLine();
            if(speed < 0){
                System.out.println("Please enter a valid speed.");
            }
        }

        while(time < 1){
            System.out.print("How long did the vehicle travel for (nearest full hour): ");
            time = stdin.nextInt();
            stdin.nextLine();
            if(time < 1){
                System.out.println("Please enter a valid time duration.");
            }
        }
        stdin.close();

        System.out.printf(" Hour %30s", "Distance Traveled\n");
        System.out.println("------------------------------------");
        
        while(counter < time+1){
            distance = speed * counter;
            System.out.printf(" %d %24.0f", counter, distance);
            System.out.println();
            counter++;
        }
       
   } 
}
