
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 12/02/2020
// ASSIGNMENT: Lab12 - Array Methods
/* PURPOSE: This applicaiton 
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
    - Perform various Array exercises as described by System output options
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --
        - String --> 
        - char --> method choice
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
import java.util.ArrayList;
import java.util.Collections;

public class Lab12 {
    public static void main(String args[]) {
        char testCase = '1';
        int[] n = { 3, 4, 5, 12, 41, 23, 33, 44 };
        int[] m = { 1, 4, 13, 32, 22, 16, 31, 40, 51 };
        Scanner stdin = new Scanner(System.in);

        System.out.println("Welcome! Below are methods you can test for arrays :)");
        System.out.println("1 - Extract Evens");
        System.out.println("2 - Compress(sums all pairs of integers)");
        System.out.println("3 - Union (combines arrays and removes dups)");
        System.out.println("4 - Shuffle (rand shuffle)");
        System.out.println("5 - Exit");
        System.out.print("Please select which function you would like to test (1-5): ");

        while (stdin.hasNextLine()) {
            testCase = stdin.nextLine().charAt(0);

            switch (testCase) {
                case '1':// Extract Evens
                    System.out.printf("Using array m: %s\n", printArray(m));
                    System.out.printf("New array without Evens: %s\n", extractEvens(m));
                    break;
                case '2': // Compress
                    System.out.printf("Using array m: %s\n", printArray(m));
                    System.out.printf("New array without Evens: %s\n", compress(m));
                    break;
                case '3':// Union
                    System.out.printf("Using array n: %s", printArray(m));
                    System.out.printf("Using array m: %s", printArray(n));
                    break;
                case '4':// Shuffle
                    System.out.printf("Using array m: %s", printArray(m));
                    break;
                case '5': // exit
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.print("Please choose a valid option: ");
            }
            // hard to break out of a switch and while
            if (testCase == '5') {
                break;
            }
            System.out.print("Please select which function you would like to test (1-4): ");

        }
        stdin.close();
    }

    private static String extractEvens(int arr[]) {
        ArrayList<Integer> evens = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evens.add(arr[i]);
            }
        }

        int size = evens.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = evens.get(i).intValue();
        }
        return (printArray(result));
    }

    private static String compress(int arr[]) {
        ArrayList<Integer> evens = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                evens.add(arr[i] + arr[i + 1]);
            } else {
                evens.add(arr[i]);
            }
            i++;
        }

        int size = evens.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = evens.get(i).intValue();
        }
        return (printArray(result));
    }

    private static String printArray(int arr[]) {
        String arrStr = "{";
        for (int i = 0; i < arr.length; i++) {
            arrStr += arr[i];
            if(i<arr.length-1){
                arrStr += ", ";
            }
        }
        arrStr += "}";
        return arrStr;
    }

}
