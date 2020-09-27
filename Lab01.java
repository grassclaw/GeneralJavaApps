// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// ASSIGNMENT: Lab01
/* PURPOSE: This applicaiton prints a provided set outputs
    - Demonstrate quotation escape in print outputs
*/
/*INPUTS
    - All inputs are hardcoded in this assignment
    - Scanner/Scanner.close() can be utilized in future
*/
/*OUTPUTS
    - Part 1: printed announcement with buffered rows
    - Part 2: Geometric shape drawn with slashes
    - Part 3: Paragraph provided with quotation formatting
*/

package Lab01;

import java.util.*;

public class Lab01 {

    public static void main(String[] args) {
        // part 1 variables
        String announcement = "Victory is mine!";
        int annBuffer = 2;
        int annLength = announcement.length() + (2 * annBuffer);

        ArrayList<String> combo = new ArrayList<String>(Arrays.asList(" ", "\\", "/", "|")); // 0 is space, 1 is
                                                                                             // backslash, and 2 is
                                                                                             // forward slash

        // part 1
        System.out.println("Part 1:");
        for (int k = 0; k < 3; k++) {
            if (k != 1) { // Prints buffer lines of forward slash
                for (int i = 0; i < annLength; i++) {
                    System.out.print(combo.get(2));
                }
            } else { // Prints announcement line with buffered bars
                for (int i = 0; i < (annBuffer * 2 + 1); i++) {
                    if (i != (annBuffer)) { // buffers
                        System.out.print(combo.get(3));
                    } else { // statement
                        System.out.print(announcement);
                    }
                }
            }
            System.out.print("\n");
        }

        // part 2 - NOTE: Attempted loop and if system but could not do it successfully
        // Print
        /*
         *   \/ 
         *  \\// 
         * \\\/// 
         * ///\\\ 
         *  //\\ 
         *   /\
         */
        System.out.println("\nPart 2:");
        System.out.println("  \\/  ");
        System.out.println(" \\\\// ");
        System.out.println("\\\\\\///");
        System.out.println("///\\\\\\");
        System.out.println(" //\\\\  ");
        System.out.println("  /\\  ");

        // part 3
        /*
         * A "quoted" String is 'much' better if you learn the rules of
         * "escape sequences." Also, "" represents an empty String. Don't forget: use
         * \" instead of " ! '' is not the same as "
         */
        System.out.println("\nPart 3:");
        System.out.println("A \"quoted\" String is");
        System.out.println("\'much\' better if you learn");
        System.out.println("the rules of \"escape sequences.\"");
        System.out.println("Also, \"\" represents an empty String.");
        System.out.println("Don't forget: use \\\" instead of \" !");
        System.out.println("\'\' is not the same as \"");
    }
}