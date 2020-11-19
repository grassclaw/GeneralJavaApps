// Part a
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/13/2020
// ASSIGNMENT: Lab07 - DiceGame
/* PURPOSE: 
//-----------------------------------------------------------------------------
//  This is the application that uses the Boxcars class to have the game
//  played between the computer and the user.  This app simply creates
// the game object, initializes the game, then tell the object to play the game.
//-----------------------------------------------------------------------------
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --
        - String --> 
        - char --> 
        - double --> 
        - int    -->  
    - named user input variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> 
    - named calculated variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> 
*/
/*PROCESSING SECTION
    - Part 1: 
    - Part 2: 
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 
/*ERRORS
    -
*/
/***********************************************************************************************/
import java.util.*;

public class BoxcarsStarter {
    public static void main( String[] args ) {      
        Scanner kb = new Scanner( System.in );      
        //  Create the game object - Boxcars.java from the student    
          Boxcars boxcarGame = new Boxcars();      
          System.out.println("Welcome to BoxCars - The Game of Dice");      
          // Get name of user, a.k.a., the human player      
          System.out.print("Who is playing against the computer? ");      
          String name = kb.next();      
          
          // Perform some initialization of the game object      
          boxcarGame.init( name );      
          
          // Let the game be played      
          boxcarGame.playGame();   }
}
