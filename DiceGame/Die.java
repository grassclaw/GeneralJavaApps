/* PURPOSE: Abstraction of a physical single die that is constructed once
Creates one Random object for the duraction o the game
*/
/*CLASSPATH
    PAIROFDICE --> DIE
*/
/*INPUTS SECTION: 
    - named constants --
        - String --> 
        - char --> 
        - double --> 
        - int    -->  
    - named user input variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> calculated roll val passed in methods
    - named calculated variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> die face value, random number
*/
/*PROCESSING SECTION
    - Part 1: 
    - Part 2: 
*/
/*OUTPUTS
    - System output face value as string
/*ERRORS
    -
*/
/***********************************************************************************************/
import java.util.Random;

public class Die {
    private int face; //have the current value of the die face
    public static Random generator = new Random(); //this ensure same object is used in the game througout

    public Die(){
        face = 1; //just giving it a value to initalize
    }

    public int roll(){
        face = generator.nextInt(6) + 1;
        return face;
    }

    public void setFace(int rollVal){
        face =  rollVal;
    }

    public int getFace(){
        return face;
    }

    public String toString(){
        String res = Integer.toString(face);

        return res;
    }
    
    
}
