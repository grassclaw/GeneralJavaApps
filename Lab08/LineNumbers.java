// Part a
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/17/2020
// ASSIGNMENT: Lab08 - LineNumbers
/* PURPOSE: This appllication
    - Opens a file, duplicates the files and consoles the written content in process of writing to new file
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
        - String --> OUTPUT_FILE (name of output file)
    - named user input variables --
        - String --> file name for duplication
        - char   --> 
        - double --> 
        - int    --> 
    - named calculated variables --
        - String --> write to file "WithLineNumbers.txt"
        - double --> 
        - int    --> counter, file length
        - Scanner--> fileInputName (finput)
*/
/*PROCESSING SECTION
    - Part 1: while loop to continue accepting entries 
    - Part 2: While loop to write data
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: fable.txt
/*ERRORS
   -
*/
/***********************************************************************************************/
import java.util.*;
import java.io.*;

public class LineNumbers {
    static final String OUTPUT_FILE = "WithLineNumbers.txt";
    public static void main(String[] args)throws FileNotFoundException{
        String fileName;
        int counter = 0;

        //Get file name (input)
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please enter the file name (example.txt): ");
        while(stdin.hasNextInt()){
            System.out.print("A string is required. Please enter a file name: ");
            stdin.next();
        }
        fileName = stdin.nextLine();
        stdin.close();

        //Read file and duplicate to "WithLineNumbers.txt and log in console"
        PrintWriter fOuput = new PrintWriter(OUTPUT_FILE);
        Scanner fInput = new Scanner(new File(fileName));
        while(fInput.hasNext()){
            counter++;
            String dataIn = fInput.nextLine();
            String formatLine = "%2s; " + dataIn + "\n";
            fOuput.printf(formatLine, counter);
            System.out.printf(formatLine, counter);
        }

        System.out.println();
        System.out.println("Contents written to file 'WithLineNumbers.txt'. Thank you!");
        fInput.close();
        fOuput.close();
    }
}
