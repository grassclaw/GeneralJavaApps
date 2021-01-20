import java.util.Scanner;

// Part a
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 11/02/2020
// ASSIGNMENT: Lab10a - Words game
/* PURPOSE: This applicaiton
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
    - Implements 4 functions (power, sumDigits, substring, devowel)
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
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        char c = 'y';
        int x = 0;
        int y = 0;
        String s = "";
        boolean valid = false;

        System.out.println("Hello! Welcome to this super fun application!");
        System.out.println("Choose a function to test from the following (1-4): ");
        Scanner stdin = new Scanner(System.in);
        while (c == 'y') {
            valid = false;
            System.out.println("  1: Power Func");
            System.out.println("  2: Sum of Digits Func");
            System.out.println("  3: Create a Substring Func");
            System.out.println("  4: Devowel Fun");
            System.out.print("Please enter a number (1-4): ");

            // Choose test
            while (!valid) {
                if (stdin.hasNext()) {
                    c = stdin.nextLine().charAt(0);
                }
                switch (c) {
                    case '1':
                        System.out.print("Please enter a number: ");
                        x = stdin.nextInt();
                        System.out.print("Please enter the power you'd like to raise it to: ");
                        y = stdin.nextInt();
                        stdin.nextLine();
                        // output
                        System.out.printf("%d raised to the power of %d is %d.\n", x, y, power(x, y));
                        valid = true;
                        break;
                    case '2':
                        System.out.print("Please enter a number whose digits will be summed: ");
                        x = stdin.nextInt();
                        stdin.nextLine();
                        // Output
                        System.out.printf("Sum of the digits in %d is %d.\n", x, sumDigits(x));
                        valid = true;
                        break;
                    case '3':
                        System.out.print("Please enter a word: ");
                        s = stdin.nextLine();
                        System.out.print("Please enter a letter position to start cutting (starts at 0): ");
                        x = stdin.nextInt();
                        System.out.print("Please indicate where to stop cutting: ");
                        y = stdin.nextInt();
                        stdin.nextLine();
                        // output
                        System.out.printf("The substring of \"%s\" desired is %s.\n", s, substring(s, x, y));
                        valid = true;
                        break;
                    case '4':
                        System.out.print("Please enter a word: ");
                        s = stdin.nextLine();
                        System.out.printf("%s devoweled became: %s.\n", s, deVowel(s));
                        valid = true;
                        break;
                    default:
                        System.out.print("Please choose a number 1-4 to invoke a function: ");
                        break;
                }
            }
            // Repeat test
            System.out.print("Would you like to perform another test (y/n)?: ");
            c = stdin.nextLine().charAt(0);
            while (c != 'y' && c != 'n' && c != 'Y' && c != 'N') {
                System.out.print("Please choose \"y\" or \"n\": ");
                c = stdin.nextLine().charAt(0);
            }
        }
        stdin.close();
        System.out.println("Bye!");
    }

    public static int power(int num, int power) {
        int mult = num;
        for (int i = 1; i < power; i++) {
            num *= mult;
        }
        return num;
    }

    public static int sumDigits(int x) {
        int rDiv = 0;
        int sum = 0;
        while (x > 0) { // 4982
            rDiv = x % 10; // 2
            sum += rDiv;
            x -= rDiv;
            x = x / 10; // 498
        }
        return sum;
    }

    public static String substring(String s, int x, int y) {
        String sub = "";
        if (x >= 0 && y >= 0 && x <= s.length() - 1 && y <= s.length() && x < y) {
            for (int i = x; i < y; i++) {
                sub += s.charAt(i);
            }
        } else {
            s = null;
        }
        return sub;
    }

    public static String deVowel(String s) {
        char ch;
        int rem = 0;
        String sub = "";
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                rem++;
            } else {
                sub += ch;
            }
        }

        if (rem == s.length()) {
            sub = null;
        }
        return sub;
    }

}
