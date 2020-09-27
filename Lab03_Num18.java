// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/15/2020
// ASSIGNMENT: Lab03 - 18 - Word Game
/* PURPOSE: Inserts string user input into prewritten word paragraph
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> none
    - string variables to hold user input of city name, name, age, college, progession, animal type, pet
*/
/*PROCESSING SECTION
    - System output paragraph with inserted answers
*/
/*OUTPUTS
    - Output char method manipulations of string
    -Note: Test cases are: Sue Daniels, 32, Los Angeles, Stanford, Magician, Monkey, Charles
***********************************************************************************************/
package Lab03;

import java.util.*;

public class Lab03_Num18 {
    public static void main(String args[]) {


        Scanner stdin = new Scanner(System.in);

        String name = "";
        String age = "";
        String city = "";
        String college = "";
        String profession = "";
        String animal = "";
        String animalName = "";

        System.out.print("Enter your name: ");
        name = stdin.nextLine();
        System.out.print("Enter your age: ");
        age = stdin.nextLine();
        System.out.print("Enter the name of a city: ");
        city = stdin.nextLine();
        System.out.print("Enter the name of a college: ");
        college = stdin.nextLine();
        System.out.print("Enter profession: ");
        profession = stdin.nextLine();
        System.out.print("Enter a type of animal: ");
        animal = stdin.nextLine();
        System.out.print("Enter a pet name: ");
        animalName = stdin.nextLine();
 


        System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", ");
        System.out.println(" " + name + " went to college at " + college + ". " + name + " graduated and went to work as a ");
        System.out.println(" " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + animalName + ". They both lived");
        System.out.println("happily ever after!");

        stdin.close();
    }
}
