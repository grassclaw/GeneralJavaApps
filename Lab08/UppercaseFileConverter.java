// Part b
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/17/2020
// ASSIGNMENT: Lab08 - UppercaseFileConverter
/* PURPOSE: This appllication
    - Opens a file, duplicates the files and consoles the written content in process of writing to new file
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
        - String --> OUTPUT_FILE (name of output file)
    - named user input variables --
        - String --> file name for duplication, file name for output
        - char   --> 
        - double --> 
        - int    --> 
    - named calculated variables --
        - String --> write to file user specified
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
      --> Part 1: fable.txt, blank.txt
/*ERRORS
   -
*/
/***********************************************************************************************/
import java.util.*;
import java.io.*;

public class UppercaseFileConverter {
    public static void main(String[] args)throws FileNotFoundException{
        String iFileName, oFileName;
        int counter = 0;

        //Get file name (input)
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please enter the name of the first file for ingest(example1.text): ");
        while(stdin.hasNextInt()){
            System.out.print("A string is required. Please enter a file name: ");
            stdin.nextLine();
        }
        iFileName = stdin.nextLine();
        //Get second file for output
        System.out.print("Please enter the name of the second file for output(example2.text): ");
        while(stdin.hasNextInt()){
            System.out.print("A string is required. Please enter a file name: ");
            stdin.nextLine();
        }
        oFileName = stdin.nextLine();
        stdin.close();

        //Read file and duplicate to specified output file and log in console"
        Scanner fInput = new Scanner(new File(iFileName));
        PrintWriter fOuput = new PrintWriter(oFileName);
        while(fInput.hasNext()){
            counter++;
            String dataIn = fInput.nextLine().toUpperCase();
            String formatLine = "%2s; " + dataIn + "\n";
            fOuput.printf(formatLine, counter);
            System.out.printf(formatLine, counter);
        }

        System.out.println();
        System.out.printf("Contents written to file '%s'. Thank you!", oFileName);
        fInput.close();
        fOuput.close();
    }
}
